package Lesson3HW;
import java.util.Scanner;

public class Task12MiddleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Our random array ---> ");
        int n = scan.nextInt();
        int array [] = new int[n];
        for (int i = 0;i < array.length; i++){
            array[i] = (int) Math.round(Math.random()*101);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int summ = 0;
        for (int i = 0; i<array.length;i++){
            summ = summ + array[i];
        }
        System.out.println("Average number from our array  -----> " + summ/array.length);
    }
}
