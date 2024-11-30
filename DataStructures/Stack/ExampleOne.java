package DataStructures.Stack;
import java.util.Stack;

public class ExampleOne {
    

    /*
     * Stack is a last-in-first-out (LIFO) data structure 
     * in Java. It is commonly used for scenarios like undo functionality, 
     * expression evaluation, or backtracking algorithms.
    */

    public class StackExample {
        public static void main(String[] args) {
            // Create a Stack
            Stack<Integer> stack = new Stack<>();
    
            // Push elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
    
            // Peek the top element
            System.out.println("Top of the stack: " + stack.peek());
    
            // Pop elements from the stack
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
    
            // Check if the stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());
        }
    }

}
