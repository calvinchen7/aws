public class Test {

    public static void main(String[] args) {
        int x;
        
        /* insert code here */
        
        /* Option A - Ok */
        
        x = 3;
        
        do {
        System.out.print("*");
        x--;
        } while (x >= 0);
        
        System.out.println("");
        
        /* Option B - It does not enter the loop. */
        
        x = 0;
        do {
        System.out.print("*");
        x++;
        } while (x >= 3);
        
        System.out.println("");
        
        /* Option C - It does not enter the loop. */
        
        x = 0;
        do {
        System.out.print("*");
        ++x;
        } while (x > 3);
        
        System.out.println("");
        
        /* Option D - I only printed two asterisks */
        
        x = 3;
        do {
        System.out.print("*");
        x--;
        } while (x != 1);
        
        System.out.println("");
        
        /* Option E - Ok */
        
        x=0;
        do {
        System.out.print("*");
        } while(x++ < 3);

        System.out.println("");
    }

}
