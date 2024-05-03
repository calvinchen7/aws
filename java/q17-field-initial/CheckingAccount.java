public class CheckingAccount {

    public int amount;
    
    public CheckingAccount (int amount) {
    this.amount = amount;
    }
    
    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }
    public void changeAmount(int x) { amount += x; }
    
    
    public static void main(String[] args) {
    CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
    
    acct.amount = 0; /* B */
    System.out.println(acct.getAmount());
    
    acct.setAmount(0); /* C */
    System.out.println(acct.getAmount());
    
    acct.changeAmount(-acct.amount); /* G */
    System.out.println(acct.getAmount());
    }
}