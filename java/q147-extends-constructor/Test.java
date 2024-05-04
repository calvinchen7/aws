    class Vehicle {
        int x;
        Vehicle() {
            this(10); // line n1
        }

        Vehicle(int x) {
            this.x = x;
        }

        public String toString() {
            return ":" + this.x;
        }
    }
    
    class Car extends Vehicle {
        public int y;
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

        //public String myString() {
        //    return super.x + ":" + this.y;
        //}
    }
    
    public class Test {
    
        public static void main(String[] args) {
            Vehicle y = new Car(20);
            System.out.println(y);

            Vehicle x = new Vehicle();
            System.out.println(x);
            //System.out.println(y.toString());
            //System.out.println(y.myString());
        }
    
    }