// Base class: Person
class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}
void displayInfo() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}

// Derived class: Student (Single Inheritance)
class Student extends Person {
String studentID;
Student(String name, int age, String studentID) {
super(name, age); // Call to the parent class constructor
this.studentID = studentID;
}
void displayStudentInfo() {
displayInfo();
System.out.println("Student ID: " + studentID);
}
}

// Derived class: GraduateStudent (Multilevel Inheritance)
class GraduateStudent extends Student {
String thesisTitle;
GraduateStudent(String name, int age, String studentID, String thesisTitle) {
super(name, age, studentID); // Call to the parent class constructor
this.thesisTitle = thesisTitle;
}

void displayGraduateStudentInfo() {
displayStudentInfo();
System.out.println("Thesis Title: " + thesisTitle);
}
}
// Another derived class: ClassRepresentative (Hierarchical Inheritance)
class ClassRepresentative extends Student {
String role;

ClassRepresentative(String name, int age, String studentID, String role) {
super(name, age, studentID); // Call to the parent class constructor
this.role = role;
}

void displayClassRepInfo() {
displayStudentInfo();
System.out.println("Role: " + role);
}
}
public class p6 {
public static void main(String[] args) {
// Single Inheritance
System.out.println("Single Inheritance Example:-");
Student = new Student("Yash", 20, "S1234");
student.displayStudentInfo();
// Multilevel Inheritance
System.out.println("\nMultilevel Inheritance Example:-");
GraduateStudent gradStudent = new GraduateStudent("Lokesh", 24, "G5678", "Artificial Intelligence");
gradStudent.displayGraduateStudentInfo();

// Hierarchical Inheritance
System.out.println("\nHierarchical Inheritance Example:-");
ClassRepresentative classRep = new ClassRepresentative("Samar", 22, "S9876", "President");
classRep.displayClassRepInfo();
}
}
 
