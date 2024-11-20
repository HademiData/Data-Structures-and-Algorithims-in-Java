package DataStructures.ArrayList;
import java.util.ArrayList;

public class ExampleOne {
    
    /*
     * ArrayList is a resizable array in Java that 
     * allows dynamic growth and shrinkage of its 
     * size. It is part of the java.util package and 
     * provides fast random access but slower 
     * insertions and deletions compared to LinkedLists.
     */

    public class ArrayListExample {
        public static void main(String[] args) {
            // Create an ArrayList
            ArrayList<String> fruits = new ArrayList<>();

            // Add elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");

            // Access elements
            System.out.println("First fruit: " + fruits.get(0));

            // Remove an element
            fruits.remove("Banana");
            System.out.println("After removal: " + fruits);

            // Iterate through the list
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }
}


