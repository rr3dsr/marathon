package day4;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

//2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Затем, используя цикл for each вывести в консоль:
  //      наибольший элемент массива
    //    наименьший элемент массива
      //  количество элементов массива, оканчивающихся на 0
        //сумму элементов массива, оканчивающихся на 0
// (Использовать сортировку запрещено.)

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int i=0;
        int i3=0;
        int stop=0;
        int stop2=0;
        int endzero=0;
        int sumzero=0;

        int ten = 10000;
        Random ran = new Random();
        for (int x : arr) {
            arr[i] = ran.nextInt(10000);
            i++;
        }

    for(int y=10000;y>0;y--){

      for(int i2=0;i2<arr.length;i2++){
          if(arr[i2]==y){stop++;
              System.out.println("biggest number "+arr[i2]+", in case "+i2);
          }
      }

    if (stop==1){break;}}

        for(int y=0;y<10000;y++){

            for(int i2=0;i2<arr.length;i2++){
                if(arr[i2]==y){stop2++;
                    System.out.println("smallest number "+arr[i2]+", in case "+i2);
                }
            }

            if (stop2==1){break;}
        }
        for(int x:arr){
            if(arr[i3]%10==0){
                endzero++;
                sumzero=sumzero+arr[i3];

            }
            i3++;
        }
        System.out.println("number of numbers are ending at 0 - "+endzero);
        System.out.println("sum of numbers are ending at 0 - "+sumzero);

    }
}