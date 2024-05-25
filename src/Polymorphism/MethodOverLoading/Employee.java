package Polymorphism.MethodOverLoading;

public class Employee{

    public int caluculateSalary(int hours, int fees){
        return hours * fees;
    }

    public int caluculateSalary(int hours, int fees, int bonus){
        return hours * fees + bonus;
    }

    public static void main(String[] args) {
        Employee mridul = new Employee();

        int mridulSalary = mridul.caluculateSalary(10,10);
        System.out.println(mridulSalary);

        int mridulSalaryFestive = mridul.caluculateSalary(10,10,5000);
        System.out.println(mridulSalaryFestive);

    }
}
