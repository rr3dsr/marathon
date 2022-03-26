package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {

            Random random = new Random();
            FileWriter file1 = new FileWriter("file1.txt");
            FileWriter file2 = new FileWriter("file2.txt");
            for (int i = 0; i < 1000; i++) {
                int x = random.nextInt(100);
                file1.write(x + " ");

            }
            file1.close();
            try {
                File readyFile = new File("file1.txt");
                Scanner scan = new Scanner(readyFile);
                String[] line = scan.nextLine().split(" ");
                int[][] numbers = new int[50][20];
                int count1 = 0;
                int count2 = 0;
                int finalSum = 0;

                for (int i = 0; i < line.length; i++) {
                    int number = Integer.parseInt(line[i]);
                    numbers[count1][count2] = number;
                    System.out.print(numbers[count1][count2] + " ");
                    count2++;
                    if (count2 == 20) {
                        int numberToDevide = 0;
                        for (int a = 0; a < 20; a++) {
                            numberToDevide += numbers[count1][a];
                        }
                        float fract = (float) numberToDevide / 20;

                        file2.write(fract + " ");
                        file2.write(" " + "\n");
                        count1++;
                        count2 = 0;

                        System.out.println("");
                    }


                }
                file2.close();
                scan.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }


        } catch (IOException e) {
            System.out.println("File was not created");

        }

        printResult(new File("file2.txt"));
    }

    public static void printResult(File file) {
        int finalSum = 0;
        float x = 0F;

        //FIRST BLOCK
        try {

            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                x += Float.parseFloat(scan.nextLine());
            }
            finalSum = (int) x;
        } catch (FileNotFoundException e) {
            System.out.println("printResult-File not found");
        }
        //END OF FIRST BLOCK.

        //SECOND BLOCK.
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            Scanner scan2=new Scanner(file);

            fileWriter.append("The Final Sum is =" + finalSum);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        //END OF THE SECOND BLOCK.
    }
}
