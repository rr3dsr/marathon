//3. Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать класс Student (Студент) с полем “Имя”.
//
//Каждый класс имеет конструктор (с параметрами), set и get методы по необходимости, а также у преподавателя есть метод
// evaluate (оценить студента), принимающий в качестве аргумента студента, и работающий следующим образом: внутри метода
// случайным образом генерируется число от 2 до 5, затем в консоль выводится строка: "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил
// студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
//Все слова, написанные большими буквами, должны быть заменены соответствующими значениями. ОЦЕНКА должна принимать значения
// "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от значения случайно сгенерированного числа.
//
//
//Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента, передав студента в качестве аргумента метода.

package day6;

import java.util.Random;

public class Teacher {
    Random x = new Random();
    private int grade = x.nextInt(5 - 2) + 1 + 2;
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.subject = subject;
        this.name = name;
    }

    public Teacher() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade(){
        return grade;
    }

    public void evaluate(Student p) {
        System.out.println("Teacher's name - " + getName());
        System.out.println("Student's name - "+p.getName()+", "+"Subject "+getSubject()+", "+"Grade "+getGrade());
        switch(this.grade){
            case 2:
                System.out.println("Not enough");
                break;
            case 3:
                System.out.println("Enough");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Great");
                break;
        }
    }
}
