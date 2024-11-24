import java.util.Scanner;
public class p1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Accept input using console class
System.out.print("Enter your input: ");
String input = scanner.nextLine();
if (!input.isEmpty()) {
System.out.println("Input recorded: " + input);
} else {
System.out.println("No input recorded.");
}
}
}
