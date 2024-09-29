import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }


    public String toString(){
        return this.accountHolder + " " + this.accountNumber + " " + this.balance;
    }
    void deposit(double amount){

        Amount a1 =new Amount( amount,TransactionType.DEPOSIT);
        this.transactions.add(a1);
        this.balance += amount;
    }
    void withdraw(double amount){
        if(balance <= this.balance){
            Amount a2 = new Amount( balance,TransactionType.WITHDRAWAL );
            this.transactions.add(a2);
            this.balance -= amount;
        }
    }
    public void printTransactionHistory(){
        System.out.println(accountHolder + accountNumber );

    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;

    }





}
