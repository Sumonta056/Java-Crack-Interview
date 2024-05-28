package Abstraction.Abstract;

public class Main {
    public static void main(String[] args) {
        Payment bkash = new BkashPayment(1000,"Bkash","Sumonta Saha");
        Payment nagad = new NagadPayment(2000,"Nagad", "Promi Saha");

        bkash.procedPayment();
        bkash.sendRecipt();

        nagad.procedPayment();
        nagad.sendRecipt();
    }
}
