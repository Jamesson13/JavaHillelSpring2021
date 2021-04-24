package Lesson3HW;
import java.util.Scanner;

public class Task4TaskwithDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your number ---> ");
        int n = scan.nextInt();
        int factorial = 1;
        int b = 1;
        do
        {
            factorial*=b;
            b++;
        }
        while(n>=b);
        System.out.println(factorial);
    }
}
