package Mock_Practice.EncapsulationP1;

public class BankClass {
    private String accounNo;
    private double balance;

    public BankClass(String accounNo, double balance){
        this.accounNo = accounNo;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void withDrawAmount(double amount){
        if(amount > 500){
            if(balance-amount < 0) balance = 0;
            else balance = balance - amount;
        }else{
            System.out.println("Withdraw Amount is too low");
        }
    }

    public void depositMoney(double amount){
        if(amount > 500){
             balance = balance + amount;
        }else{
            System.out.println("Deposit Amount is too low");
        }
    }
}
