package Mock_Practice.InheritanceP1;

public class Dog extends Animal {

    public Dog(String animalName) {
        super(animalName);
    }

    public void makeSound(){
        System.out.println(super.animalName +" makes sound vow vow");
    }
}
