class E1 extends Exception {
}

class E2 extends RuntimeException {
}

public class App {

    public void m1() throws E1 {
        System.out.println("m1.Accessed.");
        throw new E1();
    }

    public void m2() {
        System.out.println("m2.Accessed.");
        throw new E2();
    }

    public static void main(String[] args) {
        int level = 1;
        App obj = new App();
        if (level <= 5 && level >= 3) {
            try {
                obj.m1();
            } catch (Exception E1) {
                // TODO: handle exception
            }
        } else {
            obj.m2();
        }
    }
}