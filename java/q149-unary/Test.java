public class Test {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if( x++ < ++y)
        {
            System.out.println("It is Y");
        }
        else
        {
            System.out.println("It is X");
        }
        System.out.println(x + " " + y);

    }
}
