package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int randomX=20;

        List<MusicBand> musicBands=new ArrayList(){};
        musicBands.add(new MusicBand("Oloo",1990));
        musicBands.add(new MusicBand("Olop",1991));
        musicBands.add(new MusicBand("Olour",1992));
        musicBands.add(new MusicBand("Blabla",1993));
        musicBands.add(new MusicBand("Burbur",1994));
        musicBands.add(new MusicBand("Bluegel",2000));
        musicBands.add(new MusicBand("Blgel",2001));
        musicBands.add(new MusicBand("Burgul",2002));
        musicBands.add(new MusicBand("Pumpum",2003));
        musicBands.add(new MusicBand("Param",2004));

        Collections.shuffle(musicBands);

        for (int i=0;i<musicBands.size();i++){
            System.out.println(musicBands.get(i));
        }
        System.out.println(after2000(musicBands));

    }
public static List<MusicBand> after2000(List<MusicBand> xxx){
    List<MusicBand>sort2000=new ArrayList<>(xxx);
    List<MusicBand> musicBandsAfter=new ArrayList(){};
    for(int i=0;i< sort2000.size();i++){
       if(sort2000.get(i).getYear()>=2000){
           musicBandsAfter.add(new MusicBand(sort2000.get(i).getName(),sort2000.get(i).getYear()));
       }
    }
        return musicBandsAfter;
}


}
