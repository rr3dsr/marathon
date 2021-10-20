/*2. Дворовый футбол.
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость”
(англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
Статическое поле countPlayers, которое считает количество игроков на футбольном поле
 (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
Геттеры для полей “выносливость” и “количество игроков”.

и следующие методы:
run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
 Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит сообщение:
 “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского языка
 пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.

Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random, который будет
 генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно сгенерированные
  числа от 90 до 100. Вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно,
   проверить это.
Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается).
 Вывести количество игроков на поле.

*По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика русского языка учитывалась.
*/
package day7;

public class Player {
    static private int countPlayers;
    private int stamina;
    private static final int MAX_STAMINA = 100; //No any purpose in the task.
    private static final int MIN_STAMINA = 0; //No any purpose in the task.

    public static int getMAX_STAMINA(){ // Just for me.
        return MAX_STAMINA;
    }

    public static int getMIN_STAMINA(){ // Just for me.
        return MIN_STAMINA;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina(){

        return stamina;
    }

    public void run(){
        this.stamina--;
        if(stamina==0){
            countPlayers--;
        }
        else if (stamina<0){
            stamina=MIN_STAMINA;
        }

    }

    public Player(int playerPower) {
        this.stamina = playerPower;
        countPlayers++;
        if (countPlayers>6){
            System.out.println("Maximum players on the field is 6");
            countPlayers=6;
        }
    }

    public static void info(){
        int a=6-countPlayers;
        System.out.println("Players on the field "+getCountPlayers());
        if(countPlayers<6){
            System.out.println("Teams are not compiled "+"Free places on the field "+a);
        }
        else{
            System.out.println("Teams are full and ready");
        }
    }
}
