import javax.crypto.CipherInputStream;

interface I {
        public void displayI();
    }
    
    abstract class C2 implements I {
        public void displayC2() {
            System.out.println("C2");
        }
    }
    
    class C1 extends C2 {
        public void displayI() {
            System.out.print("C1");
        }
    }
    
    public class Test {
    
        public static void main(String[] args) {

            C1 c1 = new C1();
            C1 c2 = c1;
            I ic1 = c1;
            ic1.displayI();
            
            //c1 = ic1;
            //Test.java:27: error: incompatible types: I cannot be converted to C1
            //c1 = ic1;
            //     ^   
            //1 error
        
            C2 obj1 = new C1();
            I obj2 = new C1();
            
            C2 s = (C2) obj2;
            I t = obj1;
            
            t.displayI();
            s.displayC2();
        
        }
    
    }
