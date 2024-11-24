import java.util.Scanner;
public class p2 {
public static void sum(int a, int b) {
System.out.println("Sum: " + (a + b));
}
public static void sum(int a, float b) {
System.out.println("Sum: " + (a + b));
}
public static void sum(float a, int b) {
System.out.println("Sum: " + (a + b));
}
public static void sum(double a, double b) {
System.out.println("Sum: " + (a + b));
}
public static void main(String[] args) {
sum(1, 2);
sum(11, 25.0f);
sum(16.0f, 32);
sum(14.10, 142.34);
}
}