package LinkedList;

public class CheckForCircular {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

  public static boolean circularCheck(){
    
  }

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
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode !=null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args) {
        CheckForCircular list = new CheckForCircular();
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(8);
        list.addLast(10);
        list.printList();

        
    }
    
}
