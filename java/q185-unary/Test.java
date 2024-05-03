public class Test {

    public static void main(String[] args) {
        int x = 10;
        int y = ++x;
        int z = 0;

        System.out.println("1." + x + " " +  y + " " + z);

        if(y >= 10 | y <= ++x) {
            z = x;
            System.out.println("2." + x + " " +  y + " " + z);
        } else {
            z = x++;
            System.out.println("3." + x + " " +  y + " " + z);
        }
        System.out.println(z);
    }


}
