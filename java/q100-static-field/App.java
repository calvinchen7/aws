public class App {
    int count;
    public static void displayMessage() {
        count++;
        System.out.println("Welcome. Visit count: " + count);
    }
    public static void main(String[] args) {
        App.displayMessage();
        App.displayMessage();
    }
}