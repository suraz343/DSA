package LinkedList;

public class MergeSortedList {
    Doubly head;

    class Doubly {
        int data;
        Doubly prev;
        Doubly next;

        Doubly(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Insert at the beginning
    public void addFirst(int data) {
        Doubly newNode = new Doubly(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head; // Point new node to the current head
            head.prev = newNode; // Point current head's prev to new node
            head = newNode; // Update head to new node
        }
    }

    // Insert at the end
    public void addLast(int data) {
        Doubly newNode = new Doubly(data);
        if (head == null) {
            head = newNode; // If list is empty, make new node the head
            return;
        }
        Doubly currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next; // Traverse to the last node
        }
        currentNode.next = newNode; // Link last node to new node
        newNode.prev = currentNode; // Link new node back to last node
    }

    // Function to merge two sorted doubly linked lists
    public static MergeSortedList mergeList(Doubly head1, Doubly head2) {
        MergeSortedList mergedList = new MergeSortedList();
        Doubly tail = null; // Track the tail of the merged list

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                // Add the node from list1
                if (tail == null) {
                    mergedList.head = head1;
                    tail = head1;
                } else {
                    tail.next = head1;
                    head1.prev = tail;
                    tail = tail.next;
                }
                head1 = head1.next;
            } else {
                // Add the node from list2
                if (tail == null) {
                    mergedList.head = head2;
                    tail = head2;
                } else {
                    tail.next = head2;
                    head2.prev = tail;
                    tail = tail.next;
                }
                head2 = head2.next;
            }
        }

        // If list1 still has nodes
        while (head1 != null) {
            if (tail == null) {
                mergedList.head = head1;
                tail = head1;
            } else {
                tail.next = head1;
                head1.prev = tail;
                tail = tail.next;
            }
            head1 = head1.next;
        }

        // If list2 still has nodes
        while (head2 != null) {
            if (tail == null) {
                mergedList.head = head2;
                tail = head2;
            } else {
                tail.next = head2;
                head2.prev = tail;
                tail = tail.next;
            }
            head2 = head2.next;
        }

        return mergedList;
    }

    // Function to print the list from head to tail
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Doubly currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
        }
        System.out.println("null"); // Indicate the end of the list
    }

    public static void main(String[] args) {
        MergeSortedList list1 = new MergeSortedList();
        MergeSortedList list2 = new MergeSortedList();

        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);
        System.out.println("List 1:");
        list1.printList();

        list2.addLast(5);
        list2.addLast(15);
        list2.addLast(25);
        list2.addLast(35);
        System.out.println("List 2:");
        list2.printList();

        MergeSortedList mergedList = mergeList(list1.head, list2.head);
        System.out.println("Merged List:");
        mergedList.printList();
    }
}
