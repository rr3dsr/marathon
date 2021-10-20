/* 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов
принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
 какой из самолетов длиннее.
*/
package day7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random ran=new Random();
        int x= ran.nextInt(200-50)+1+50;
        int y= ran.nextInt(200-50)+1+50;
        Airplane air1 = new Airplane();
        Airplane air2 = new Airplane();
        air1.setLength(x);
        air2.setLength(y);
        Airplane.compareAirplanes(air1, air2);
    }
}