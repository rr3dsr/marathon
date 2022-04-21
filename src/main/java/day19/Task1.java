package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {


        HashMap<String,Integer> mapWords=new HashMap<>();

        List <Poem> hashedWords=new ArrayList<>();

        File file=new File("src/main/resources/dushi.txt");






        try {
            Scanner scan=new Scanner(file);
            scan.useDelimiter("[.,:;()?!\"\\s–]+");
            while(scan.hasNext()){
                int counter=0;
                String word=scan.next();
                if (mapWords.containsKey(word)){

                    counter=mapWords.get(word)+1;
                }
                mapWords.put(word,counter);
            }
            scan.close();

            HashMap<String,Integer> mapWords2=new HashMap<>(mapWords);
            int whileCounter= 100;
            while(whileCounter>0) {

                int topWordRepetitions=0;
                String topWord=null;

                for (Map.Entry<String, Integer> pare : mapWords2.entrySet()) {
                    if (pare.getValue() > topWordRepetitions) {
                        topWordRepetitions = pare.getValue();
                        topWord= pare.getKey();
                    }
                }
                hashedWords.add(new Poem(topWordRepetitions,topWord));
                mapWords2.remove(topWord);
                whileCounter--;
           }
            for(Poem x:hashedWords){
                System.out.println(x);
            }
            System.out.println(mapWords.size());




        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }




}
class Poem{
   private int wordRepetitions;
    private String word;


public Poem(int wordRepetitions,String word){
    this.wordRepetitions=wordRepetitions;
    this.word=word;
}
public String toString(){
    return "Word-"+word+" "+"Number of repetitions- "+wordRepetitions;
}
}