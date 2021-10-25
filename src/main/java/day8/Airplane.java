package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int width;
    private int fuel;

    public Airplane(String producer, int year, int fuel) {
this.producer=producer;
this.year=year;
this.fuel=fuel;
    }
    public String toString(){
        return year+","+producer;
    }
}
