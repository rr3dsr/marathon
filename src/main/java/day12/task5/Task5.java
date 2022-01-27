package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist = new MusicArtist();
        MusicBand bandA = new MusicBand("Uksus", 1553, artist);
        MusicBand bandB = new MusicBand("Sahar", 1998, artist);
        bandA.addPlayerToArtistsArray("Vasya Bublik", 98);
        bandA.addPlayerToArtistsArray("Petya Hlebov", 48);
        bandA.addPlayerToArtistsArray("Saveliy Kalach", 60);
        bandA.addPlayerToArtistsArray("Bonya Vatrushkin", 77);

        bandB.addPlayerToArtistsArray("Anton Stolyar", 47);
        bandB.addPlayerToArtistsArray("Vasya Svarshik", 23);
        bandB.addPlayerToArtistsArray("Jora Uborshik", 120);
        bandB.addPlayerToArtistsArray("Kostya Mehanik", 58);
        bandB.addPlayerToArtistsArray("Vitya Santehnik", 98);

        transferMembers(bandA, bandB);


    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        List<MusicArtist> transfer = new ArrayList<>(bandA.getArtistsArray());
        for (int i = 0; i < transfer.size(); i++) {
            bandB.addPlayerToArtistsArray(transfer.get(i).getName(), transfer.get(i).getAge());
        }
        bandA.cleanArtistsArray();
        bandB.printArtistsArray();
        System.out.println("");
        bandA.printArtistsArray();
    }

}

