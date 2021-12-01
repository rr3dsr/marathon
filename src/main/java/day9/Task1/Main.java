package day9.Task1;

public class Main {
    public static void main(String[] args){
        Student student=new Student("Bob","New students");
        Teacher teacher=new Teacher("John","Math");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
