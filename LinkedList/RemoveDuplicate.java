package LinkedList;

public class RemoveDuplicate {
    Node head;

    // Node class representing each element of the linked list
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to find duplicates in the sorted linked list
    public void findDuplicates() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node currentNode = head;
        
        // Loop through the list
        while (currentNode != null && currentNode.next != null) {
            // Compare the current node with the next node
            if (currentNode.data == currentNode.next.data) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }
    //method to print the list
    public void printList(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
    }

    // Method to add elements to the linked list
    public void add(int data) {
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

    public static void main(String[] args) {
        RemoveDuplicate list = new RemoveDuplicate();
        
        // Adding sorted elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        
        // Finding duplicates in the sorted linked list
        list.findDuplicates();
        list.printList();
    }
}
