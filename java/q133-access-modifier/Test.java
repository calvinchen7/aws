/* A */
abstract class A3 {
    private static int i;
    public void doStuff(){}
    public A3(){}
    }
    
    /* B */
    final class A1 {
    public A1(){}
    }
    
    /* C */
    private class A2{ // Illegal Modifier for the class A2
    private static int i;
    private A2(){}
    }
    
    /* D */
    class A4 {
    protected static final int i = 10;
    private A4() {}
    }
    
    /* E */
    final abstract class A5 { // The class A5 can be either final or abstract, not both
    protected static int i;
    void doStuff() {}
    abstract void doIt();
    }


public class Test {

    public static void main(String[] args) {
        
    }

}
