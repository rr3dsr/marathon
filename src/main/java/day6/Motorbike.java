package day6;


class Motorbike {
    private String name;
    private String color;
    private int productionYear;
    int resultYearDifference;

    public Motorbike() {
        this.name = name;
        this.color = color;
        this.productionYear = productionYear;
    }

    public int getYear(int productionYear) {
        this.productionYear = productionYear;
        return this.productionYear;
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    public void info() {
        System.out.println("This is a bike");
    }

    int yearDifference(int inputYear) {
        inputYear = inputYear - this.productionYear;
        if (inputYear < 0) {
            inputYear = inputYear * -1;
            resultYearDifference = inputYear;
            return resultYearDifference;
        } else {
            resultYearDifference = inputYear;
            return resultYearDifference;
        }
    }
}
