package root;
public class Tree {

    public Tree() {
        System.out.println("Constructor Tree");
    }

    public void m1(){
        System.out.println("Tree m1");
        this.m2();
        this.m3();
        this.m4();
    }

    private void m2(){
        System.out.println("Tree m2");
    }
    protected void m3(){
        System.out.println("Tree m3");
    }

    void m4(){
        System.out.println("Tree m4");
    }
}