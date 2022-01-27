package day12.task3;

public class MusicBand {
   private String name;
    private Integer year;
    public MusicBand(String name, Integer year){
        this.name=name;
        this.year=year;
    }
public String getName(){
        return this.name;
}
    public Integer getYear() {
        return this.year;
    }

    public String toString(){
        return this.name+" "+this.year;
    }
}
