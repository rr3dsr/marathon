
/* 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов
принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
 какой из самолетов длиннее.
*/

package day7;
public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int width;
    private int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
    public int getLength(){
        return length;
    }

    public Airplane() {
    }

    public Airplane(String producer, int year, int length, int width) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.width = width;
        this.fuel = 0;
    }

    public int fillup(int n) {
        this.fuel = this.fuel + n;
        return this.fuel;
    }

    public void info() {
        System.out.println("Production " + this.producer + " " + "Production year " + this.year + " " + "Airplane length " + this.length + " " + "Airplane width " + this.width + " " + "Fuel points " + this.fuel);
    }
    public static void compareAirplanes(Airplane lengthone,Airplane lengthtwo){
        if(lengthone.getLength()>lengthtwo.getLength()){
            System.out.println("Airplane one bigger");}
            else if(lengthtwo.getLength()> lengthone.getLength()){
                System.out.println("Airplane two bigger");
            }
            else{
            System.out.println("Airplanes are equals");
        }
        }
    }
