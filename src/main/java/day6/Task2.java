package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane flyfly = new Airplane("Air", 1996, 200, 50);
        flyfly.setYear(2001);
        flyfly.setLength(250);
        flyfly.fillup(30);
        flyfly.fillup(50);
        flyfly.info();
    }
}