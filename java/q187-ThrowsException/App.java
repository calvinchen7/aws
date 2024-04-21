import java.lang.Exception;
import java.lang.RuntimeException;

class LogFileException extends Exception {}
class AccessViolationException extends RuntimeException {}


class App {
    public static void main(String[] args) throws LogFileException {
        App obj = new App();
        try {
            obj.open();
            obj.process();
            throw new LogFileException();
        }
        catch (Exception e) {
            System.out.println("Completed");
        }
    }

    void process() /* throws LogFileException */{
        System.out.println("Processed");
        throw new LogFileException();
    }

    void open() {
        System.out.println("Opened");
        throw new AccessViolationException();
    }
}