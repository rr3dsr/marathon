package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
      dizzyNumbs(new File("numbs"));


    }
    public static void dizzyNumbs(File file){
        double sum=0;
        try {
            Scanner scan=new Scanner(file);
            String line= scan.nextLine();
            String[] numbs=line.split(" ");
            for (int i=0;i< numbs.length;i++){
                int x=Integer.parseInt(numbs[i]);
                sum=sum+x;
            }
            sum=sum/ numbs.length;
            System.out.println(sum);
            double scale=Math.pow(10,3);
            double x=Math.ceil(sum*scale)/scale;
            float y=(float)x;
            System.out.println(y);

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}

