public class FieldInit {
    Character c;
    boolean b;
    float f;

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        System.out.println(f.c);
        System.out.println(f.b);
        System.out.println(f.f);
    }   // Output: null false 0.0 
}
