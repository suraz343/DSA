package LinkedList;

class Node {
    int data;
    Node next;
    
    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseALinkedList {
    Node head;

    // Function to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;   // Store next node
            current.next = prev;   // Reverse the current node's pointer
            prev = current;        // Move pointers one position ahead
            current = next;
        }
        head = prev;  // Update head to point to the new first node
    }

    // Function to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseALinkedList list = new ReverseALinkedList();

        // Inserting nodes into the linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original Linked List:");
        list.printList();

        // Reversing the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
