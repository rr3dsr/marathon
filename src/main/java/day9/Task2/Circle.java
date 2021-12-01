package day9.Task2;

public class Circle extends Figure{
    double rad;
    public Circle(double rad,String color){
        super(color);
        this.rad=rad;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(rad,2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*rad;
    }

}
