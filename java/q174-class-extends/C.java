    class A {
        public void test() {
            System.out.println("A");
        }
    }
    class B extends A{
        public void test() {
            System.out.println("B");
        }
    }
    public class C extends A {
        public void test() {
        System.out.println("C");
        }
    
        public static void main(String[] args) throws InterruptedException {
            A b1= new A();
            A b2 = new C();
            A b3 = (B) b2;
            b1 = (A) b2;
            b1.test();
            b3.test();
        }
    }