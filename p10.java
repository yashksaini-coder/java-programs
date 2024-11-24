import java.util.ArrayList;
import java.util.List;

public class p10 {
public static void main(String[] args) {
List<String> list = new ArrayList<>();

String title = """ ArrayList""";
System.out.println("\n"+title);

list.add("Apple");
list.add("Banana");
list.add("Cherry");
list.add("Date");

System.out.println("Initial List: " + list);
System.out.println("Element at index 1: " + list.get(1));

list.set(2, "Coconut");
System.out.println("List after setting index 2 to 'Coconut': " + list);

list.remove(3);
System.out.println("List after removing element at index 3: " + list);

list.remove("Banana");
System.out.println("List after removing 'Banana': " + list);

boolean containsApple = list.contains("Apple");
System.out.println("List contains 'Apple': " + containsApple);
int size = list.size();
System.out.println("Size of the List: " + size);
System.out.print("List elements: ");

for (String item : list) {
System.out.print(item + " ");
}

System.out.println();
list.clear();
System.out.println("List after clearing: " + list);
boolean isEmpty = list.isEmpty();
System.out.println("Is the list empty? " + isEmpty);
list.add("Grapes");
list.add("Orange");
list.add("Pineapple");
System.out.println("List after adding new elements: " + list);
String[] array = list.toArray(new String[0]);
System.out.println("Array converted from the list: ");
for (String fruit : array) {
System.out.println(fruit);
}

// Example with ArrayList of Integers
List<Integer> integerList = new ArrayList<>();

integerList.add(10);
integerList.add(20);
integerList.add(30);
integerList.add(40);

System.out.println("\nInitial Integer List: " + integerList);
System.out.println("Element at index 2: " + integerList.get(2));

integerList.set(1, 25);
System.out.println("List after setting index 1 to 25: " + integerList);

integerList.remove(3);
System.out.println("List after removing element at index 3: " + integerList);

integerList.remove(Integer.valueOf(10));
System.out.println("List after removing integer 10: " + integerList);

boolean containsTwenty = integerList.contains(20);
System.out.println("List contains 20: " + containsTwenty);

int intSize = integerList.size();
System.out.println("Size of the Integer List: " + intSize);

System.out.print("Integer List elements: ");
for (Integer number : integerList) {
System.out.print(number + " ");
}
System.out.println();

integerList.clear();
System.out.println("Integer List after clearing: " + integerList);

boolean intIsEmpty = integerList.isEmpty();
System.out.println("Is the Integer list empty? " + intIsEmpty);

integerList.add(50);
integerList.add(60);
integerList.add(70);
System.out.println("Integer List after adding new elements: " + integerList);

Integer[] integerArray = integerList.toArray(new Integer[0]);
System.out.println("Array converted from the Integer list: ");
for (Integer number : integerArray) {
System.out.println(number);
}
}
}

