package day4;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
int [][] arr=new int[12][8];
int string;
int column;
Random random=new Random();
int sum=0;
for (string=0;string< arr.length;string++){
    for(column=0;column<8;column++){
        arr[string][column]= random.nextInt(50);
    }
}
   for(int i=0;i<arr.length;i++){
       for (int j=0;j<8;j++){
           sum=sum+arr[i][j];
           System.out.print(arr[i][j]+" ");
       }
       System.out.println("  str "+i+" string sum "+sum);
   sum=sum*0;
   }
    }
}
