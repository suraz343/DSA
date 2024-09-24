package LinkedList;

public class InsertAtBeginning {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    //Add last
public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node currentNode = head;
    // Traverse to the last node (where currentNode.next is null)
    while (currentNode.next != null) {
        currentNode = currentNode.next;
    }
    // Now, currentNode is the last node, so set its next to the newNode
    currentNode.next = newNode;
}

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        InsertAtBeginning list = new InsertAtBeginning();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(0);
        list.printList();
        

    }
}
