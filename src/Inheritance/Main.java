package Inheritance;

public class Main {
    public static void main(String[] args) {
        RegularCustomer customer1 = new RegularCustomer("Sumonta Saha",24
                ,"Narayganganj","sumontasaha80@gmail.com","018422242421",20);

        customer1.displayCustomerDetails();

//        customer1.setDiscount(10);
        System.out.print("Customer Total After Discount : ");
        System.out.println(customer1.transactionAfterDiscount(100));


    }
}
