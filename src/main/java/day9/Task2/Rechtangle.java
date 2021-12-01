package day9.Task2;

public class Rechtangle extends Figure{
    double sideA;
    double sideB;

    public Rechtangle(double sideA,double sideB,String color){
        super(color);
        this.sideA=sideA;
        this.sideB=sideB;

    }

    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public double perimeter() {
        return 2*(sideA+sideB);
    }
}
