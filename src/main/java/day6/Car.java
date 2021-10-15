package day6;

class Car {
    private String name;
    private String color;
    private int productionYear;

    public void setName(String carname) {
        if (carname.isEmpty()) {
            System.out.println("name field is empty");
        } else {
            name = carname;
        }
    }

    public String getName() {
        return name;
    }

    public void setColor(String newcolor) {
        if (newcolor.isEmpty()) {
            System.out.println("color field is emty");
        } else {
            color = newcolor;
        }
    }

    public String getColor() {
        return color;
    }

    public void setProductionYear(int newYear) {
        if (productionYear < 0) {
            System.out.println("wrong year");
        } else {
            productionYear = newYear;
        }
    }

    public int getYear() {
        return productionYear;
    }

    public void info() {
        System.out.println("This is a car");
    }

    int yearDifference(int inputYear) {
        inputYear = inputYear - productionYear;
        if (inputYear < 0) {
            inputYear = inputYear * -1;
            return inputYear;
        } else {
            return inputYear;
        }
    }
}