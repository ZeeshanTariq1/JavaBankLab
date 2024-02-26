public class Bank {
    private int accountnumber;
    private String accountholder;
    private double balance;

    public Bank() {
    }

    public Bank(int accountnumber, String accountholder) {
        this.accountnumber = 0;
        this.accountholder = "default";
    }

    public Bank(int accountnumber, String accountholder, double balance) {
        this.accountnumber = accountnumber;
        this.accountholder = accountholder;
        this.balance = balance;
    }
    public double deposit(double amount){
        if(amount>0){
            this.balance += amount;
            System.out.println("deposited succesfully");
        }
        return this.balance;
    }
    public double withdraw(double amount){
        if(amount>0 && amount<=this.balance){
            this.balance -=amount;
            System.out.println("withdraw successfully");
        }
        else{
            System.out.println("withdraw not successfull");
        }
        return this.balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}