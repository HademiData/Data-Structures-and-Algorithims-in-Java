package DataStructures.BuffersExamples;
import java.nio.ByteBuffer;


public class ExamleOne {
    

    /*
     * A Buffer in Java is used to handle data efficiently when reading 
     * from or writing to streams. Buffers are part of the java.nio 
     * package (New Input/Output), and they act as containers for 
     * data that you want to manipulate before actually performing
     *  I/O operations.
     */

     /*
      * Key Concepts of Buffers in Java:
    
      Buffer Types: There are different types of buffers, such as ByteBuffer, CharBuffer, IntBuffer, etc., depending on the type of data you're working with.
    
      Capacity, Limit, Position: Buffers have a capacity (maximum number of elements they can hold), a limit (the point at which you cannot read or write further data), and a position (which element you are currently reading or writing).
    
      Direct and Non-Direct Buffers: Direct buffers are allocated outside of the JVM heap memory, providing faster I/O operations.
        */

    public class BufferExample {
        public static void main(String[] args) {
            // Create a ByteBuffer with a capacity of 10
            ByteBuffer buffer = ByteBuffer.allocate(10);

            // Write data into the buffer
            buffer.put((byte) 10);
            buffer.put((byte) 20);
            buffer.put((byte) 30);

            // Flip the buffer to switch from writing mode to reading mode
            buffer.flip();

            // Read data from the buffer
            System.out.println("Buffer content:");
            while (buffer.hasRemaining()) {
                System.out.println(buffer.get());
            }

            // Rewind the buffer to read from the start again
            buffer.rewind();
            System.out.println("Buffer content after rewind:");
            while (buffer.hasRemaining()) {
                System.out.println(buffer.get());
            }
        }
    }
}
