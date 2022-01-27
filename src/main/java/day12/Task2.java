package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Numbers numbers=new Numbers();
        numbers.createList(50);
        numbers.createList(300);
        System.out.println(numbers);
    }
}

class Numbers {
    private List<Integer> smallNumb = new ArrayList<>();
    private List<Integer> bigNumb = new ArrayList<>();


    public void createList(int a) {
        if (a <= 50) {
            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    smallNumb.add(i);
                }
            }
        } else if (a > 50) {
            for (int i = 50; i < a; i++) {
                if (i % 2 == 0) {
                    bigNumb.add(i);
                }
            }
        }
    }
    public String toString(){
        return "Array of small numbers -"+ smallNumb+"\n"+"Array of a big numbers -"+bigNumb;
    }
}