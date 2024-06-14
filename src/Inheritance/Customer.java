package Inheritance;

public class Customer {
    String customerName;
    int customerAge;
    String customerLocation;
    String customerEmail;
    String customerPhoneNumber;


    public Customer(String customerName, int customerAge, String customerLocation, String customerEmail, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerLocation = customerLocation;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void displayCustomerDetails(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Email : "+ customerEmail);
        System.out.println("Customer Address : "+ customerLocation );
        System.out.println("Customer Age : " + customerAge);
        System.out.println("Customer Phone Number : "+customerPhoneNumber);
    }
}
