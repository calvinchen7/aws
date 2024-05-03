public class App {

    int foo;
    static int bar;

    static void process() {
        foo += 10;
        bar += 10;
    }

    // Entry point of the program
    public static void main(String[] args) {
        App app = new App();
        app.process();
        System.out.println(app.foo);
    }
}
