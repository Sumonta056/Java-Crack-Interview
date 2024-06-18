package Mock_Practice.InheritanceP1;

public class Cat extends Animal{
    public Cat(String animalName) {
        super(animalName);
    }

    public void makeSound(){
        System.out.println(super.animalName +" makes sound meow meow");
    }
}
