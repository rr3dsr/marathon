package day6;

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
}
