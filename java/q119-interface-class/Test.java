class C2 {
    public void displayC2(){
        System.out.println("C2");
    }
}
    
interface I {
    public void displayI();
}
    
class C1 extends C2 implements I {
    public void displayI() {
        System.out.println("C1");
    }
}
    
    public class Test {
    public static void main(String[] args) {
        I obj4 = new C1();
        C1 obj5 = obj4;
        obj5.displayC2();
        obj5.displayI();


        C2 obj1 = new C1();
        I obj2 = new C1();
        
        C2 s = obj2;
        I t = obj1;
        
        t.displayI();
        s.displayC2();
    }
}