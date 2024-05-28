package Abstraction.Abstract;

public class BkashPayment extends Payment{
    BkashPayment(double amount, String type, String userName) {
        super(amount, type, userName);
    }

    @Override
    public void procedPayment() {
        System.out.println(type+ " Payment Done Successful : " + amount);
    }
}
