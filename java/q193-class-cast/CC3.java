class CC1 {

}
class CC2 extends CC1 {

}


public class CC3 extends CC2 {

    public static void main(String[] args) {


    CC1 obj1 = (CC1) new CC2();
    CC2 obj2 = (CC2) new CC3();
    CC2 obj3 = (CC2) new CC1(); // ClassCastException
    CC3 obj4 = (CC3) obj2;

    }

}