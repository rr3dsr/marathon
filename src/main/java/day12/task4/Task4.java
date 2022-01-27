package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand aGroup = new MusicBand("Bulb", 1997);
        MusicBand bGroup = new MusicBand("Rumba", 1556);
        aGroup.addPlayer("Makrel Litvinova");
        aGroup.addPlayer("Shura Karpov");
        aGroup.addPlayer("Krab Sidorovich");
        aGroup.addPlayer("Sazan Jirnov");

        bGroup.addPlayer("Stepan Kurochkin");
        bGroup.addPlayer("Artem Dyatlov");
        bGroup.addPlayer("Harlam Skvorcov");
        bGroup.addPlayer("Ptich'ya Lichnost");
        System.out.println(aGroup.getSize());

        transferMembers(aGroup,bGroup);

        System.out.println(bGroup.getMembers());
        System.out.println(aGroup.getMembers());
    }
    public static void transferMembers(MusicBand aGroup2,MusicBand bGroup2){
        List<String> transfer=new ArrayList<>(aGroup2.getMembers());
        for (String x:transfer){
            bGroup2.addPlayer(x);
        }

        for (int i= transfer.size()-1;i>-1;i--){
            aGroup2.removePlayer(i);

        }

    }
}
