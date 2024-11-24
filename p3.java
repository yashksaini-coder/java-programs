import java.util.Scanner;
public class p3 {
public static void main(String[] args) {
Scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
int num1 = scanner.nextInt();
System.out.print("Enter the second number: ");
int num2 = scanner.nextInt();
if (num2 != 0) {
double result = (double) num1 / num2;
System.out.println("Result: " + result);
} else {
System.out.println("Not divisible by zero");
}
scanner.close();
}
}
