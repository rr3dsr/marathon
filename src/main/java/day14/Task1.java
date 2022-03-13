package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException{
        printSumDigits(new File("numbs"));

    }
    public static void printSumDigits(File file) throws IOException{

        int sum=0;
        try{
            Scanner scan=new Scanner(file);
            String xxx=scan.nextLine();
            String[] line=xxx.split(" ");
            if (line.length<10){
                throw new IOException();
            }

            for (String number:line){
                sum+=Integer.parseInt(number);
            }
        }
        catch ( FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println(sum);
    }
}
