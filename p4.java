class Customer {
int acno;
String name;
double balance;
public Customer(int acno, String name, double balance) {
this.acno = acno;
this.name = name;
this.balance = balance;
}

public double computeInterest() {
if (balance >= 75000) {
return balance * 0.08;
} else if (balance >= 40000) {
return balance * 0.06;
} else {
return balance * 0.03;
}
}

public void displayDetails() {
System.out.println("Account Number: " + acno);
System.out.println("Name: " + name);
System.out.println("Balance: " + balance);
System.out.println("Interest: " + computeInterest());
}
}

public class p4 {
public static void main(String[] args) {
Customer customer1 = new Customer(19012004, "Yash", 50000);
Customer customer2 = new Customer(22032003, "Lakshy", 85000);
Customer customer3 = new Customer(04112003, "Paras", 15000);
Customer customer4 = new Customer(24092004, "Deepanshu", 65000);

customer1.displayDetails();
customer2.displayDetails();
customer3.displayDetails();
customer4.displayDetails();
}
}

