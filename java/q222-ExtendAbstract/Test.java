abstract class Robot implements Speakable {
    public void process(); // replace public void process(); with public abstract void process();
}

class Humanoid extends Robot {
    public void speak(String s) {
    System.out.println(s);
}

public void process() {
    System.out.println("Helping... ");
}
}

interface Speakable {
public void speak(String s);
}

public class Test {
    
    public static void main(String[] args) {
    
    Robot r = new Humanoid();
    r.process();
    r.speak("Done");
    
    }
}