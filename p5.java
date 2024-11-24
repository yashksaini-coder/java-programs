import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p5 {
public static void main(String[] args) {
String fileName = "D://JAVA-5th-SEM//Main//java.txt";
try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = br.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
e.printStackTrace();
}
}
}
