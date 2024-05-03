



// DerivedB.java
class DerivedB extends DerivedA {

    public void test() {
        System.out.println("DerivedB ");
    }

    public void derivedBTest()
    {
        System.out.println("DerivedB Test");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3;
        b1 = (Base) b2;
        b1.test();
        b4.test();

        b1.baseTest();
        b4.baseTest();

        b3.derivedBTest();
        /*
        PS C:\Users\Calvin\Documents\GitHub\aws\java\q177-Class-Extends> javac *.java
        DerivedB.java:29: error: cannot find symbol
                b3.derivedBTest();
                ^
        symbol:   method derivedBTest()   
        location: variable b3 of type Base
        1 error
        */
    }

}