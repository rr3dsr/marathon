package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2. Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей. Реализовать статический метод
//List<String> parseFileToStringList(File file), который считывает содержимое этого файла и возвращает список,
// состоящий из значений имен и возрастов каждого человека.
// Получить данный список в методе main() и распечатать его в консоль.
public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println(parsePeople(new File("people")));

    }

    public static List<String> parsePeople(File file) throws IOException {
        List<String> crowd = new ArrayList();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {

                String unit = scan.nextLine();
                crowd.add(unit);
                String[] human = unit.split(" ");
                int age = Integer.parseInt(human[1]);
                if (age < 0) {
                    crowd.clear();
                    System.out.println(crowd);
                    throw new IOException();
                }


            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return crowd;
    }
}
