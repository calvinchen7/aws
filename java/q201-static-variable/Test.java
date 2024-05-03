class StockRoom {
    private static int stock = 10;
    private static int qty = 0;
    public void purchase(int qty) { 
        stock += qty;
        this.qty = qty;
     }
    public void sell (int qty) { 
        stock -= qty; 
        this.qty = qty;
    }

    public void printStock (String action) {
        System.out.println( action + ":" + qty + " items. Stock in Hand: " + stock); // qty needs to be static variable to compile.
    }
}
    
public class Test {
        public static void main(String[] args) {
            StockRoom k1 = new StockRoom();
            k1.sell(5);
            k1.printStock("Sold");
            StockRoom k2 = new StockRoom();
            k2.purchase(5);
            k2.printStock("Purchased");
        }
}