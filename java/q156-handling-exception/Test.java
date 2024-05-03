import java.io.IOException;

class MyException extends RuntimeException {
};

public class Test {
    public static void main(String[] args) {
        method1();

        try {
            method2();
        } catch (IOException e) {
            // TODO: handle exception
        }

        method3();
    }

    public static void method1() {
    try {
            // throw new IOException();
            throw 3 > 10 ? new MyException() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");
        }catch(Exception re ){
            System.out.println("B");
        }
    }

    public static void method2() throws IOException{
        throw new IOException();
    }

    
    public static void method3() throws RuntimeException{
        throw new RuntimeException();
    }
}