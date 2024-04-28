package branch;

import root.Tree;

public class Plant extends Tree{
    public Plant() {
        System.out.println("Constructor Plant");
    }
    // public void m1(){}
    public void m2(){}
    //public void m3(){}
    public void m4(){}

    public static void main(String[] args){
        Plant t = new Plant();
        t.m1();
        t.m2();
        t.m3();
        t.m4();

        Tree tree = new Plant();
        tree.m1();
    }
}