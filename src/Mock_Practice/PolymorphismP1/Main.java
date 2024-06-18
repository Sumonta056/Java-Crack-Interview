package Mock_Practice.PolymorphismP1;

interface Shape{
    void calculateArea();
}
class Rectangle implements Shape{
    double width,height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = width*height;
        System.out.println("Rectangle Area = "+area);
    }
}

class Circle implements Shape{

    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = "+area);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,12);
        r1.calculateArea();

        Circle c1 = new Circle(10);
        c1.calculateArea();
    }
}
