package Lesson3HW;
import java.util.Scanner;

public class Task9and10MinandMaxInMass {
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
        for(int i = 1;i<array.length;i++){
            if(array[i]<min) {
                min = array[i];
            }else if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Min number from our array ---> "+ min);
        System.out.println("Max number from our array ---> "+ max);

    }
}
