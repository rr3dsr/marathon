package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String s=File.separator;
        File file=new File("src"+s+"main"+s+"resources"+s+"shoes.csv");
        try {
            FileWriter fw=new FileWriter("shoes.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String line= scan.nextLine();
                String[]splited=line.split(";");

                int x=Integer.parseInt(splited[2]);
                if (x==0){
                    fw.write("\n"+splited[0]+","+splited[1]+","+splited[2]);
               }
            }
            fw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("No such file directory");
        }

    }
}
