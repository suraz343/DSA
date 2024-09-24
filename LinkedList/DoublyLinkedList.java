package LinkedList;

public class DoublyLinkedList {
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
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.printList(); // Output: 20 <-> 10 <-> 30 <-> 40 <-> null
    }
}
