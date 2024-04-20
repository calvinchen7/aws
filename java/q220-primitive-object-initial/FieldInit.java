public class FieldInit {
    Character c;
    boolean b;
    float f;

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        System.out.println(f.c);
        System.out.println(f.b);
        System.out.println(f.f);

        double y1 = 203.22; float fit = y1;
        float fit1 = (float) 1_11.00;
        Float fit2 = 100.00;
        int y2 = 100; float fit3 = (float) y2;
        float fit4 = 100.00F;

        System.out.println(fit);
        System.out.println(fit1);
        System.out.println(fit2);
        System.out.println(fit3);
        System.out.println(fit4);



    }   // Output: null false 0.0 
}
