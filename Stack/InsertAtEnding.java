import java.util.Stack;

public class InsertAtEnding {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        
        s1.push(3);
        s1.push(4);
        s1.push(5);

        
        int elementToInsert = 6;

        
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(elementToInsert);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        
        System.out.println("Stack after inserting " + elementToInsert + " at the bottom:");
        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }
}
