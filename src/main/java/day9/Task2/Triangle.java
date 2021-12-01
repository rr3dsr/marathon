package day9.Task2;

public class Triangle extends Figure{
    double sideA;
    double sideB;
    double sideC;
public Triangle(double sideA,double sideB,double sideC,String color){
    super(color);
    this.sideA=sideA;
    this.sideB=sideB;
    this.sideC=sideC;
}
    @Override
    public double area() {
        return (sideA+sideB+sideC)/2;
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }
}
