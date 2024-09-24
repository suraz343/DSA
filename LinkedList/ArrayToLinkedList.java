package LinkedList;

public class ArrayToLinkedList {
    public static void main(String[] args) {
        int arr[] = {1,2,7,9,10};
        ArrayToLinkedList list = new ArrayToLinkedList();

    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }



    }
    
}
