package day4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
int[] arr=new int[100];
int i=0;
int sum=0;
Random random =new Random();

 for(int x:arr){
    arr[i]= random.nextInt(10000);
    i++;
}
    Arrays.sort(arr);
 System.out.println(Arrays.toString(arr));
 sum=sum+arr[97]+arr[98]+arr[99];
 System.out.println("97 "+sum);
    }
}
