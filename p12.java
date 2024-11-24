import java.util.HashSet;

public class p12 {
public static void main(String[] args) {
HashSet<String> set = new HashSet<>();
String title = """HashSet""";
System.out.println("\n"+title);

set.add("A");
set.add("B");
set.add("C");
set.add("D");
set.add("E");
set.add("A"); // Duplicate element

// Checking the size
System.out.println("Size of set: " + set.size());

// Checking for an element
System.out.println("Contains alphabet (B): " + set.contains("B"));

System.out.println("The alphabet in the set are: ");
// Iterating through the set
for (String fruit : set) {
System.out.println(fruit);
}

set.remove("D");

// Checking if set is empty
System.out.println("Is the set empty? " + set.isEmpty());

// Clearing the set
set.clear();
System.out.println("Size after clearing: " + set.size());
}
}
