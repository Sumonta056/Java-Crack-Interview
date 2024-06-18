package Mock_Practice.InheritanceP1;

public class Animal {
    public String animalName;
    public Animal(String animalName){
        this.animalName = animalName;
    }
    public void makeSound(){
        System.out.println(animalName +" makes sound pep pep");
    }
}

