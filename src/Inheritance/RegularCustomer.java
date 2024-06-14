package Inheritance;

public class RegularCustomer extends Customer{

    private int discount;

    public RegularCustomer(String customerName, int customerAge, String customerLocation, String customerEmail, String customerPhoneNumber,int discount) {
        super(customerName, customerAge, customerLocation, customerEmail, customerPhoneNumber);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Double transactionAfterDiscount(double amount){

        double finalCost = amount - (amount * ((double) discount /100));
        return finalCost;
    }
}
