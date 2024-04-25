import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList myList = new ArrayList();
String[] myArray;
try{
while (true){
myList.add("My string");
}
}catch (RuntimeException e){
System.out.println("catch RunTimeException");
}catch (Exception e){
System.out.println("catch Exception");
}
System.out.println("Ready to use ");
}
}