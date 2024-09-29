//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(432432432 ,"Asanovva ") ;
        account.deposit(700.0);
        account.withdraw(700.5);

    account.printTransactionHistory();
        System.out.println(account.getBalance());
       if (account.getBalance()<=0){
           System.out.println("There is not enough money to withdraw");
       }
    }
}