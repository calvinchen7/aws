class Test{

    public static int stvar = 100;
    public int var = 200;

    public String toString(){
    return stvar
     + ":" + var;
    }
    public static void main(String[] args) {
    
        Test t1 = new Test();
        t1.var= 300;
        System.out.println(t1);

        Test t2 = new Test();
        t2.stvar =300;
        System.out.println(t2);
    
    
    }
}