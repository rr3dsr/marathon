package day12.task5;

public class MusicArtist {
    String name;
    Integer age;
    public MusicArtist(){

    }
    public MusicArtist(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(Integer age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public String toString(){
        return this.name+" "+this.age;
    }
}
