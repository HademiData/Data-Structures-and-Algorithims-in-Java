package DataStructures.LinkedList;
import java.util.LinkedList;


public class ExampleOne {
    
    /*
     *  LinkedList is a doubly linked list implementation in Java.
     *  It is suitable for scenarios where frequent insertions and
     *  deletions are required, but accessing elements is slower
     *  compared to ArrayLists.
    */

    public class LinkedListExample {
        public static void main(String[] args) {
            // Create a LinkedList
            LinkedList<String> animals = new LinkedList<>();
    
            // Add elements
            animals.add("Dog");
            animals.add("Cat");
            animals.add("Elephant");
    
            // Access the first and last elements
            System.out.println("First animal: " + animals.getFirst());
            System.out.println("Last animal: " + animals.getLast());
    
            // Remove an element
            animals.remove("Cat");
            System.out.println("After removal: " + animals);
    
            // Iterate through the list
            for (String animal : animals) {
                System.out.println(animal);
            }
        }
    }

    
}
