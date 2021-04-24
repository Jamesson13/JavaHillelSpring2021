package Lesson3HW;
import java.util.Scanner;

public class Task5Multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add first number ---> ");
        int x = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Add second number ---> ");
        int n = scan1.nextInt();

        int result = x;

        for(int i = 1; i<n;i++){
            result *= x;
            System.out.println(result);
        }
        System.out.println(result);







    }
}
