/* Create class BankAccount
deposit()
withdraw()
showBalance()  */

class Bankaccount{
    double money;

    Bankaccount(double money){
        this.money = money;
    }
    void deposit(double amount){
        money += amount;
        System.out.println(amount + " amount deposited successfully");
    }
    void withdraw(double amount){
        if(amount<money){
            money -= amount;
            System.out.println(amount+ " withdrawn successfully");
        }else{
          System.out.println("Insufficient amount available");
        }
    }
    void showbalance(){
        System.out.println("Available balance : " + money);
    }
}

public class Bankacc {
    public static void main(String[] args) {
        Bankaccount obj = new Bankaccount(15_000);
        obj.deposit(15000);
        obj.withdraw(5000);
        obj.showbalance();

    }
    
}
