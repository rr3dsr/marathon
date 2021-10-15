package day6;

public class Task1 {
    public static void main(String[] args) {
        Car drdr = new Car();
        Motorbike brbr = new Motorbike();

        drdr.info();
        brbr.info();
        drdr.setProductionYear(1878);
        int yearDifference = drdr.yearDifference(1778); //Тут такой способ.
        System.out.println(yearDifference);

        brbr.getYear(1896);
        brbr.yearDifference(2005);
        System.out.println(brbr.resultYearDifference); // А тут такой. Не совсем ясно с задания. Так же не ясно зачем тут нужно TaskN
    }
}