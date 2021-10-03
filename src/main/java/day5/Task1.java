package day5;

public class Task1 {
    public static void main(String[] args) {
Car model1=new Car ();
        model1.setName("Boyota");
        model1.setColor("green");
        model1.setYear(1);
        System.out.println("Car name-"+model1.getName()+" Car color is- "+model1.getColor()+" And its "+model1.getYear()+" years on the road.");
    }
}
class Car{
    private String name;
    private String color;
    private int year;
    public void setName(String carname){
        if (carname.isEmpty()){
            System.out.println("name field is empty");
        }
        else
        {name=carname;}
    }
    public String getName(){
         return name;
    }
    public void setColor(String newcolor){
        if(newcolor.isEmpty()){
            System.out.println("color field is emty");
        }
        else{color=newcolor;}
    }
    public String getColor(){
        return color;
    }
    public void setYear(int newYear){
        if (year<0){
            System.out.println("wrong year");
        }
        else{year=newYear;}
    }
    public int getYear(){
        return year;
    }
}