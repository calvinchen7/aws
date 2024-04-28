class P1 {
    public void play(){ 
        System.out.println("P1: Test");
    }
}
class P2 extends P1 implements I1 {
    public void play(){ System.out.println("P2: Test");}
}
interface I1{
    void play();
}

public class Test {
    public static void main(String[] args) {
        P1 obj = new P1();
        P2 obj2 = new P2();
        I1 obj3 = new P2();

        System.out.println(obj);
        boolean r1 = obj instanceof P2;

        System.out.println(obj2);
        boolean r2 = obj2 instanceof P1;
        obj2.play();

        System.out.println(obj3);
        boolean r3 = obj3 instanceof I1;
        obj3.play();
        
        

        System.out.println(r1 + ":" + r2 + ":" + r3);
    }
}