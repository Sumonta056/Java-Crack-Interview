package Abstraction.Abstract;

abstract class Payment {
    double amount;
    String type;
    String userName;

    Payment(double amount, String type, String userName){
        this.amount = amount;
        this.type = type;
        this.userName =userName;
    }

    public abstract void procedPayment();

    public void sendRecipt(){
        System.out.println(type + " Payment Done to "+ userName + ": Amount = " +amount);
    }
}
