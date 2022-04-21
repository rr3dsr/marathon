package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        HashMap<Integer, Point> cars = new HashMap<>();
        SquarePoint firstSquarePoint = new SquarePoint();
        SquarePoint secondSquarePoint = new SquarePoint();

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                int carNumber = 0;
                int xAxis = 0;
                int yAxis = 0;
                int counter = 0;
                String line = scan.nextLine();
                String[] lines = line.split(" ");

                for (String carSoup : lines) {
                    counter++;
                    int parameter = Integer.parseInt(carSoup);
                    if (counter == 1) {
                        carNumber = parameter;
                    } else if (counter == 2) {
                        xAxis = parameter;
                    } else {
                        yAxis = parameter;
                    }
                }
                cars.put(carNumber, new Point(xAxis, yAxis));
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


// four numbers input (x;y)(x;y)
        System.out.println("Enter 4 positive numbers-field square. Separate numbers with comma");
        Scanner fieldCoordinates = new Scanner(System.in);
        String lineCoordinates = fieldCoordinates.nextLine();
        String[] arrayLineCoordinates = lineCoordinates.split(",");

        //checking numbers of incoming values
        if (arrayLineCoordinates.length > 4) {
            System.out.println("Wrong input");
            return;
        }

        int[] intFieldCoordinates = new int[arrayLineCoordinates.length];
        int countFieldCoordinates = 0;

        //arrays converting str=>int
        for (String line : arrayLineCoordinates) {
            int x = Integer.parseInt(line);
            if (x < 0) {
                System.out.println("Wrong input - negative number");
            }
            intFieldCoordinates[countFieldCoordinates] = x;
            countFieldCoordinates++;
        }
        if (intFieldCoordinates[0] == intFieldCoordinates[2] || intFieldCoordinates[1] == intFieldCoordinates[3]) {
            System.out.println("X or Y coordinates cannot be equal.");
            return;
        }

        //selecting first point by greater X dot value.
        if (intFieldCoordinates[2] < intFieldCoordinates[0]) {
            firstSquarePoint.setX(intFieldCoordinates[2]);
            firstSquarePoint.setY(intFieldCoordinates[3]);
            secondSquarePoint.setX(intFieldCoordinates[0]);
            secondSquarePoint.setY(intFieldCoordinates[1]);
        } else {
            firstSquarePoint.setX(intFieldCoordinates[0]);
            firstSquarePoint.setY(intFieldCoordinates[1]);
            secondSquarePoint.setX(intFieldCoordinates[2]);
            secondSquarePoint.setY(intFieldCoordinates[3]);
        }

        System.out.println("First point is " + firstSquarePoint);
        System.out.println("Second point is " + secondSquarePoint);

        System.out.println("Cars in selected area");
        for (Map.Entry<Integer, Point> car : cars.entrySet()) {
            int x = car.getValue().getX();
            int y = car.getValue().getY();
            if (x > firstSquarePoint.getX() && x < secondSquarePoint.getX() && y > firstSquarePoint.getY() && y < secondSquarePoint.getY() && y != firstSquarePoint.getY() && y != secondSquarePoint.getY() && x != firstSquarePoint.getX() && x != secondSquarePoint.getX()) {
                System.out.println("Car number- "+car.getKey()+" is in area");
            }

        }
    }


}

class SquarePoint {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }


    public int getY() {
        return this.y;
    }

    public String toString() {
        return "X coordinate- " + this.x + "\n Y coordinate- " + this.y;
    }
}
