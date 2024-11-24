import java.util.LinkedList;
import java.util.List;
public class p11{
private static class node{
int data;
node next;
node(int data){
this.data = data;
this.next = null;
}
}
private node head;
public p11(){
this.head = null;
}
public void add(int data){
node newNode = new node(data);
if(this.head == null){
this.head = newNode;
}else{
node temp = this.head;
while(temp.next != null){
temp = temp.next;
}
temp.next = newNode;
}
}

public void display(){
node temp = this.head;
while(temp != null){
System.out.print(temp.data + " ");
temp = temp.next;
}
System.out.println();
}

public void remove(int data){
if(this.head == null){
return;
}
if(this.head.data == data){
this.head = this.head.next;
return;
}
node temp = this.head;
while(temp.next != null){
if(temp.next.data == data){
temp.next = temp.next.next;
return;
}
temp = temp.next;
}
}

public void removeAt(int index){
if(this.head == null){
return;
}
if(index == 0){
this.head = this.head.next;
return;
}
node temp = this.head;
for(int i = 0; temp != null && i < index - 1; i++){
temp = temp.next;
}
if(temp == null || temp.next == null){
return;
}
temp.next = temp.next.next;
}

public void clear(){
this.head = null;
}

public boolean isEmpty(){
return this.head == null;
}

public int size(){
int count = 0;
node temp = this.head;
while(temp != null){
count++;
temp = temp.next;
}
return count;
}

public boolean contains(int data){
node temp = this.head;
while(temp != null){
if(temp.data == data){
return true;
}
temp = temp.next;
}
return false;
}

public int get(int index){
node temp = this.head;
for(int i = 0; temp != null && i < index; i++){
temp = temp.next;
}
if(temp == null){
return -1;
}
return temp.data;
}

public static void main(String[] args){
p11 list = new p11();

String title = """LinkedList""";
System.out.println("\n"+title);


list.add(10);
list.add(20);
list.add(30);
list.add(40);

list.display();
System.out.println("Element at index 2: " + list.get(2));

list.remove(30);
list.display();

list.removeAt(1);
list.display();

System.out.println("Size of the List: " + list.size());
System.out.println("List contains 20: " + list.contains(20));
System.out.println("List contains 30: " + list.contains(30));

list.clear();
System.out.println("List after clearing: ");
list.display();
System.out.println("Is the list empty? " + list.isEmpty());
}
}

 
