public class App {
    static float height;
    public float jump(long x) {
    System.out.println("Jump 1");
        return height + x;
    }

    public float jump(int x) {
        System.out.println("Jump 2");
    return height + x;
    }

    public float jump(float x) {
        System.out.println("Jump 3");
    return height + x;
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.jump(10);
        obj.jump(100);
        obj.jump(10.01f);
    }
}