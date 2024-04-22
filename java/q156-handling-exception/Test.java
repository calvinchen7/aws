import java.io.IOException;

class MyException extends RuntimeException {
};

public class Test {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
        } catch (IOException ex) {
            System.out.print("B");
        }
    }

    public static void method1() throws IOException{
    try {
            throw 3 > 10 ? new MyException() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");
        }catch(Exception re ){
            System.out.println("B");
        }
    }
}