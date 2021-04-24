package Lesson3HW;
import java.util.Arrays;
import java.util.Scanner;

public class Task11ChangeMaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add the length of the array ---> ");
        int n = scan.nextInt();
        int array [] = new int[n];
        System.out.println("Our random array ---> ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 101)-50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = 0;
        int max = 0;
        int minInd = 0;
        int maxInd = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]<min) {
                minInd = i;
                min = array[i];
            }else if(array[i]>max){
                maxInd = i;
                max=array[i];
            }
        }
        System.out.println("Min number from our array ---> "+ min);
        System.out.println("Max number from our array ---> "+ max);


        int temp = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = temp;


        //Or much easier
//        array[minInd]= max;
//        array[maxInd]= min;
        for (int j : array) {
            System.out.print(j + " ");
        }


    }
}
