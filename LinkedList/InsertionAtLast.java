package LinkedList;

import LinkedList.ArrayToLinkedList.Node;

public class InsertionAtLast {
    public static void main(String[] args) {
        Node head = new Node(d:1);
        head.next = new Node(d:2);
        head.next.next= new Node(d:3);
        head.next.next.next= new Node(d:4);
        head.next.next.next.next = new Node(d:5);


    }
    public static Node insert(Node head, int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
        return head;

    }
    
}
