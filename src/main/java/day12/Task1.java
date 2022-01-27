package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> cars=new ArrayList<>();
        cars.add("Audi");
        cars.add("BMV");
        cars.add("Lada");
        cars.add("Dacia");
        cars.add("Ford");

        for(int i=0;i< cars.size();i++){
            System.out.print(cars.get(i)+" ");
        }
cars.add(2,"Wolkswagen");
        System.out.println();

        for(int i=0;i< cars.size();i++){
            System.out.print(cars.get(i)+" ");
        }

        cars.remove(0);
        System.out.println();

        for(int i=0;i< cars.size();i++){
            System.out.print(cars.get(i)+" ");
        }
    }
}
