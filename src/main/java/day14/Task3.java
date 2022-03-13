package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws WrongAgeException{
        System.out.println(parsePeople(new File("people")));
    }

    public static List<Person> parsePeople(File file)throws WrongAgeException {
        List<Person> shindlersList = new ArrayList<>();
        try {
            File file1 = new File("people");
            Scanner scan = new Scanner(file1);
            while (scan.hasNextLine()) {
                String[] line = scan.nextLine().split(" ");
                String name = line[0];
                int age = Integer.parseInt(line[1]);
                if(age<0){
                    throw new WrongAgeException("Wrong age input");
                }
                shindlersList.add(new Person(name, age));


            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return shindlersList;
    }
}
