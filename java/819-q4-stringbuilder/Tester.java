public class Tester {

    public static void main(String[] args) {
        StringBuilder test = new StringBuilder("01234567");
        test.delete(2, 7);
        System.out.println(test);

        StringBuilder sb = new StringBuilder(5);

        sb.append("HOWDY");
        System.out.println(sb);

        sb.insert(0, ' ');
        System.out.println(sb);

        sb.replace(3, 5, "LL");
        System.out.println(sb);

        sb.insert(6, "COW");
        System.out.println("\\" + sb + "\\");

        sb.delete(2, 7);
        System.out.println(sb);

        System.out.println(sb.length());
    }
    
}