

public class ClassBehavior {

    //can have overloaded static methods
    static int proof() {
        return 1;
    }

    static int proof(int a) {
        return a;
    }

    //can have method name same as variable name
    int sum;

    int sum() {
    //fields not necessarily needs to be initialed before use
        return sum+=1;
    }

    //can have multiple private constructor
    private ClassBehavior() {

    }

    private ClassBehavior(int a) {

    }

    void methodA() {
    System.out.println("Inside A");
    }

//No main method required
}