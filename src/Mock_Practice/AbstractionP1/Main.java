package Mock_Practice.AbstractionP1;

abstract class Appliance{
    public abstract void operate();
}

class washingMachine extends Appliance{

    @Override
    public void operate() {
        System.out.println("Washing Machine Running");
    }
}

class microWave extends Appliance{
    @Override
    public void operate() {
        System.out.println("Mircowave Running");
    }
}

public class Main {
    public static void main(String[] args) {
        Appliance washingM1 = new washingMachine();
        washingM1.operate();

        washingM1 = new microWave();
        washingM1.operate();
    }
}
