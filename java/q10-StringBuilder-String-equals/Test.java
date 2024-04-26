public class Test {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        if(sb.toString().equals(s.toString()))
        {
            System.out.println("Match 1");
        }

        if(sb.equals(s))
        {
            System.out.println("Match 2");
        }


    }

}
