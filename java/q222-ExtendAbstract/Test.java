abstract class Robot implements Speakable {
    //public abstract void process(); // replace public void process(); with public abstract void process();
    public void process() {
        System.out.println("Processing... ");
    };
}

class Humanoid extends Robot {
    public void speak(String s) {
        super.process();
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