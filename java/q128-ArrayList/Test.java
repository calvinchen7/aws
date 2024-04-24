import java.util.*;

public class Test {

    public static void main(String[] args) {

        
        try {

            List <String> colors = new ArrayList();
            if(colors != null)
            {
            colors.add("Green");
            colors.add("Blue");
            colors.add("Red");
            colors.add("Yelow");
            colors.remove(2);
            colors.add(3,"Cyan");
            
            System.out.println(colors);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }


        
    }

}
