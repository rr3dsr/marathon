package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private Integer year;
    MusicArtist artist;
    private List<MusicArtist> artistsArray = new ArrayList<>();


    public MusicBand(String name, Integer year, MusicArtist artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }
public List<MusicArtist> getArtistsArray(){
List <MusicArtist> transfer=new ArrayList<>(artistsArray);
return transfer;
}
public void cleanArtistsArray(){
        artistsArray.clear();
}

    public void addPlayerToArtistsArray(String name, Integer age) {
        artistsArray.add(new MusicArtist(name, age));
    }
    public void printArtistsArray(){
        List<MusicArtist> list=new ArrayList<>(artistsArray);
        for(int i=0;i< list.size();i++){
            System.out.println( "Age "+list.get(i).getAge()+" "+"Name "+list.get(i).getName());
        }
    }

    public String getName() {
        return this.name;
    }

    public Integer getYear() {
        return this.year;
    }

    public String toString() {
        return this.name + " " + this.year;
    }
}
