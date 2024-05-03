public class SumTest {

    public static void doSum(Integer a, Integer b) {
    System.out.println("Integer sum is " + (a + b));
    }

    //public static void doSum(int a, int b) {
    //    System.out.println("int sum is " + (a + b));
    //}

    public static void doSum(float a, float b )
    {
        System.out.println("float sum is " + (a + b));
    }

    public static void doSum(double a, double b )
    {
        System.out.println("double sum is " + (a + b));
    }

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
    }

}
