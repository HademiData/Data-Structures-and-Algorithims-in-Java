package DataStructures.HashMapExamples;

import java.util.HashMap;

public class ExampleOne {

    /*
     * A HashMap in Java is part of the java.util package and is used to store key-value pairs. It allows fast lookups, insertions, and deletions by using a hashing algorithm to map keys to values. This makes it ideal for situations where you need to quickly access data based on a unique key.

        Key Features:

        1. Key-Value Pair: Each entry consists of a key and a corresponding value.
        2. No Duplicate Keys: Each key in a HashMap is unique.
        3. Order: The order of the entries is not guaranteed (unordered).
        4. Null Values: You can have null as a key or value in a HashMap.
     */


    public class HashMapExample {
        public static void main(String[] args) {
            // Creating a HashMap to store student names and their corresponding grades
            HashMap<String, Integer> studentGrades = new HashMap<>();

            // Adding elements to the HashMap
            studentGrades.put("Alice", 85);
            studentGrades.put("Bob", 90);
            studentGrades.put("Charlie", 78);

            // Accessing an element by key
            System.out.println("Alice's grade: " + studentGrades.get("Alice"));

            // Checking if a key exists
            if (studentGrades.containsKey("Bob")) {
                System.out.println("Bob's grade: " + studentGrades.get("Bob"));
            }
            
            // Removing an element by key
            studentGrades.remove("Charlie");
            
            // Iterating over HashMap keys and values
            System.out.println("Remaining students and grades:");
            for (String student : studentGrades.keySet()) {
                System.out.println(student + ": " + studentGrades.get(student));
            }
        }
    }


        

}
