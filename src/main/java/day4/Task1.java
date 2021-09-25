package day4;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
Random rand=new Random();
int greate8=0;
int equal1=0;
int dev2=0;
int nondev2=0;
int sum=0;
int n=scan.nextInt();
int[]arr=new int[n];
System.out.println("Length of array "+arr.length);
System.out.println("Your array numbers");
for(int i=0;i< arr.length;i++) {
    arr[i] = rand.nextInt(10);
  }
System.out.print(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
        if (arr[i]>8){greate8++;}
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==1){equal1++;}
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==1){equal1++;}
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){dev2++;}
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){nondev2++;}
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
    System.out.println("");
    System.out.println("Number of numbers greater then 8 is - "+greate8);
        System.out.println("");
        System.out.println("Number of numbers equal to 1 is - "+equal1);
        System.out.println("");
        System.out.println("Number of even numbers  - "+dev2);
        System.out.println("");
        System.out.println("Number of non even numbers  - "+nondev2);
        System.out.println("");
        System.out.println("Sum of an all numbers is  - "+sum);
    }
    }