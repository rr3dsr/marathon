package day9.Task1;

public class Human {
   private String name;
    public Human(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void printInfo(){
        System.out.println("This man has a name "+this.name);
    }
}
