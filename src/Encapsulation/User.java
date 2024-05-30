package Encapsulation;

public class User {
    public static void main(String[] args) {
        BankSystem publiBank = new BankSystem();

        publiBank.setUserName("Sumonta Saha");
        publiBank.setAccountNumber(11905031);
        publiBank.depositAmount(500);

        System.out.println(publiBank.getUserName());
        System.out.println(publiBank.getAccountNumber());
        System.out.println(publiBank.getBalance());

        publiBank.depositAmount(500);
        System.out.println(publiBank.getBalance());

        publiBank.depositAmount(-500);
        System.out.println(publiBank.getBalance());

        publiBank.withDrawAmount(300);
        System.out.println(publiBank.getBalance());

        publiBank.withDrawAmount(1200);
        System.out.println(publiBank.getBalance());

        publiBank.depositAmount(1200);
        System.out.println(publiBank.getBalance());
        System.out.println(publiBank.getLastTransactionTime());

        publiBank.withDrawAmount(1100);
        System.out.println(publiBank.getBalance());
        System.out.println(publiBank.getLastTransactionTime());
    }
}
