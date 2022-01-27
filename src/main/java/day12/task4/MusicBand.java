package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private Integer year;
    private List<String> player = new ArrayList<>();

    public int getSize() {
        return player.size();
    }

    public void removePlayer(int x) {
        player.remove(x);
    }

    public void addPlayer(String PlayerNameAndSurname) {
        player.add(PlayerNameAndSurname);
    }

    public List<String> getMembers() {
        return this.player;
    }

    public void printMembers() {
        List<String> members = new ArrayList<>(player);
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }

    }

    public MusicBand(String name, Integer year) {
        this.name = name;
        this.year = year;
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
