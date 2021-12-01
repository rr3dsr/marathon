package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rechtangle(5, 10, "Red"),
                new Rechtangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(figures[4].perimeter());
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double redSumPer=0;
        for (int i = 0; i < figures.length; i++) {
            String color = figures[i].getColor();
            if (color == "Red") {
                redSumPer = redSumPer + figures[i].perimeter();
            }
        }
        return redSumPer;
    }

    public static double calculateRedArea(Figure[] figures){
        double sumRedArea=0;
        for (int i=0;i<figures.length;i++){
            String y=figures[i].getColor();
            if(y=="Red"){
                sumRedArea=sumRedArea+figures[i].area();
                return sumRedArea;
            }
        }
        return 0;
    }

}

