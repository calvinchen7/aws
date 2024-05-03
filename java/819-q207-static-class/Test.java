public class Test {

    private static class Greet {
        private void print() {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        Test.Greet i = new Greet();
        i.print();;
        System.out.println(i);

        Test.Greet j = new Greet();
        i.print();
        System.out.println(j);
    }

    // https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html#:~:text=Static%20nested%20classes%20do%20not,declared%20public%20or%20package%20private.)
}
