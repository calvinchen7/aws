    class Vehicle {
        int x;
        Vehicle() {
            this(10); // line n1
        }

        Vehicle(int x) {
            this.x = x;
        }
    }
    
    class Car extends Vehicle {
        int y;
        Car() {
        super(10); // line n2
        }
        Car(int y) {
        super(y);
        this.y = y;
        }
    
        public String toString() {
            return super.x + ":" + this.y;
        }
    }
    
    public class Test {
    
        public static void main(String[] args) {
            Vehicle y = new Car(20);
            System.out.println(y);
        }
    
    }