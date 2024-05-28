package Abstraction.Abstract;

public class NagadPayment extends Payment {
    NagadPayment(double amount, String type, String userName) {
        super(amount, type, userName);
    }

    @Override
    public void procedPayment() {
        System.out.println(type+ " Payment Done Successful : " + amount);
    }
}
