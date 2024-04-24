import java.io.IOException;

class Test {
    public void printFileContent() throws IOException {
        throw new IOException();
    }
    
    public static void main(String[] args) throws IOException {
        Test xobj = new Test();
        xobj.printFileContent();
    }
}