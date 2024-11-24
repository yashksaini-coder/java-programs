import java.util.PriorityQueue;
import java.util.Comparator;

public class p13 {

public static void main(String[] args) {
// Creating a Priority Queue (Min-Heap by default)
PriorityQueue<Integer> pq = new PriorityQueue<>();

String title = “”” Priority Queue“””
System.out.println("\n"+title);
System.out.println("---------------------------------------------------------------------------------------------------------\n");

// Insert elements into the priority queue
pq.add(10);
pq.add(20);
pq.add(15);
pq.add(30);
pq.add(5);

System.out.println("Priority Queue: " + pq);

// Peek the top element (Minimum element in min-heap)
System.out.println("Peek (Top Element): " + pq.peek());

// Dequeue (Extract minimum element)
System.out.println("Dequeue (Removed Element): " + pq.poll());

// Peek again after dequeuing
System.out.println("Peek after Dequeue: " + pq.peek());

// Check if the priority queue is empty
System.out.println("Is the priority queue empty? " + pq.isEmpty());

// Get the size of the priority queue
System.out.println("Size of priority queue: " + pq.size());

// Simulate change in priority by removing 20 and reinserting with a new value
pq.remove(20);  // Remove 20
pq.add(2);      // Add new value 2

System.out.println("Priority Queue after changing priority of 20: " + pq);

// Delete a specific element
pq.remove(15);
System.out.println("Priority Queue after removing 15: " + pq);
}
}


