public class StockRoom {
    private static int stock = 10;
    private static int qty; 
    public void purchase(int q) {stock += q; this.qty = q;}
    public void sell(int q) {stock -= q; this.qty = q;}
    public static void printStock(String action ) {
    System.out.println(action + ":" + qty + " items. Stock in Hand: " + stock);
    }
    
    public static void main (String[] args) {
        StockRoom k1 = new StockRoom();
        k1.sell(5);
        StockRoom.printStock("Sold");
        StockRoom k2 = new StockRoom();
        k2.purchase(5);
        StockRoom.printStock("Purchased");
    }
}
