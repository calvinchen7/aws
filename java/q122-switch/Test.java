public class Test {

    public static void main (String [] args) {

        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s : days) {
            System.out.println("----------------------");
            switch (s) {
                case "sat":
                case "sun":
                    wd--;
                    System.out.println(wd + " sun ");
                break;
                case "mon":
                    wd++;
                    System.out.println(wd + " mon ");
                case "wed":
                    wd += 2;
                    System.out.println(wd + " wed ");
            }
        }
        System.out.print(wd + " ");
    }
}
