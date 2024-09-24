package LinkedList;

public class ReverseDoubly {
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

    // Code to reverse the doubly linked list
    public void reverseTheDoubly() {
        Doubly currentNode = head;
        Doubly prev = null;

        while (currentNode != null) {
            Doubly next = currentNode.next; // Store next node
            currentNode.next = prev; // Reverse the next pointer
            currentNode.prev = next; // Reverse the prev pointer
            prev = currentNode; // Move prev to current node
            currentNode = next; // Move to next node
        }
        head = prev; // Update head to the new front of the list
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
        ReverseDoubly list = new ReverseDoubly();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Original List:");
        list.printList(); // Output: 20 <-> 10 <-> 30 <-> 40 <-> null

        list.reverseTheDoubly(); // Reverse the list

        System.out.println("Reversed List:");
        list.printList(); // Output: 40 <-> 30 <-> 10 <-> 20 <-> null
    }
}
