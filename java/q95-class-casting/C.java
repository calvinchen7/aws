class A {
    public void test () {
    System.out.println ("A");
    }
}
    
class B extends A {
    public void test () {
    System.out.println ("B");
    }
}
    
public class C extends A {
    
    public void test () {
    System.out.println ("C");
    }
    
    public static void main(String[] args) {
        A b1 = new A ();
        A b2 = new C ();
        A b4 = new B ();

        b1.test();
        b2.test();
        b4.test();
        
        b1 = (A) b2; //line n1
        b1.test ();
        b2.test ();

        A b3 = (B) b2; //line n2
        b3.test ();

/* 
PS C:\Users\Calvin\Documents\GitHub\aws\java\q95-class-casting> javac *.java
PS C:\Users\Calvin\Documents\GitHub\aws\java\q95-class-casting> java C
A
C
B
C
C
Exception in thread "main" java.lang.ClassCastException: class C cannot be cast to class B (C and B are in unnamed module of loader 'app')
        at C.main(C.java:32)
*/

    }
}