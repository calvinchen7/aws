    class Bird {
        public void fly() {
            System.out.print("Bird Fly.");
        }   
    }
    
    class Peacock extends Bird {
        public void dance() {
            System.out.println("Peacock Dance.");
        }

        @Override
        public void fly() {
            System.out.println("Peacock Fly");
        }
    }
    
    public class Test {
        
        public static void main(String[] args) {
            Bird b = new Peacock (); 
            b.fly();

            Peacock p = (Peacock) b;
            p.fly();
            p.dance();
            

        }
    
    }