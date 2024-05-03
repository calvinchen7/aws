public class Test {
    int count = 0;

    public static void main(String[] args) {
        Test.displayMessage();
        displayMessage();
    }

    public static void displayMessage()
    {
        System.out.println("Welcome : " + count++);
    }
}
