package day8;

public class Task1 {
    public static void main(String[] args) {
        String a = "";
        StringBuilder b = new StringBuilder(" ");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            a = " " + a + " " + i;
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(stopTime - startTime);

        long startTimes = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            b.append(i).append(" ");
        }
        long stopTimes = System.currentTimeMillis();
        System.out.println(stopTimes - startTimes);
    }

}
