package Mock_Practice.EncapsulationP1;

public class Main {
    public static void main(String[] args) {
        BankClass pubalicBank = new BankClass("1021",400);
        System.out.println("Current Amount = "+ pubalicBank.getBalance());
        pubalicBank.withDrawAmount(300);
        System.out.println("Current Amount = "+ pubalicBank.getBalance());
        pubalicBank.withDrawAmount(600);
        System.out.println("Current Amount = "+ pubalicBank.getBalance());
        pubalicBank.depositMoney(300);
        System.out.println("Current Amount = "+ pubalicBank.getBalance());
        pubalicBank.depositMoney(600);
        System.out.println("Current Amount = "+ pubalicBank.getBalance());

    }
}
