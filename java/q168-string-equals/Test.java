public class Test {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("java");
        
        if(str2.equals(str1.toLowerCase())) //line n1
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        
    }

}
