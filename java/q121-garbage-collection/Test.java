public class Test {

    public static void main(String[] args) {
        Object w1 = new Object();
        Object w2 = new Object();
        Object w3 = new Object();
        w1 = w3;
        w3 = w2;
        w2 = null;
        
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}
