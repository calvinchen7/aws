import java.io.IOException;

class Test {

    //Test.java:5: error: unreported exception IOException; must be caught or declared to be thrown
    //    throw new IOException();
    //    ^
    //1 error
    public void printFileContent() throws IOException{
        throw new IOException();
    }

    //Test.java:15: error: unreported exception InterruptedException; must be caught or declared to be thrown
    //throw new InterruptedException();
    //^
    //1 error

    public void printInterruptedException() throws InterruptedException 
    {
        throw new InterruptedException();
    }

    public void printRuntimeException() 
    {
        throw new RuntimeException();
    }

    
    /*
    public static void main(String[] args) {

        Test xobj = new Test();
        try {
            xobj.printFileContent();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    */


    public static void main(String[] args) throws IOException, InterruptedException{
        Test xobj = new Test();

        xobj.printFileContent();

        xobj.printRuntimeException();

        xobj.printInterruptedException();

    }
}