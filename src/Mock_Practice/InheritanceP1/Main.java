package Mock_Practice.InheritanceP1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.makeSound();
        Animal dogo = new Dog("Dog");
        dogo.makeSound();
        Animal pussy = new Cat("Cat");
        pussy.makeSound();
    }
}
