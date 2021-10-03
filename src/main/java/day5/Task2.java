package day5;


public class Task2 {
    public static void main(String[] args) {
Motorbike bike=new Motorbike("any name","any color",10);
        System.out.println(bike.getColor()+" "+bike.getName()+" "+bike.getYear());
    }
}
class Motorbike{
    private String name;
    private String color;
    private int year;
    public Motorbike(String name,String color,int year){
        this.name=name;
        this.color=color;
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }
    public String getColor(){
        return this.color;
    }
    public String getName() {
        return this.name;
    }
}