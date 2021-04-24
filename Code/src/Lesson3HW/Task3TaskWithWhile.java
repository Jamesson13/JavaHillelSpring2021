package Lesson3HW;
import java.util.Scanner;

public class Task3TaskWithWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your number ---> ");
        int n = scan.nextInt();
        int factorial = 1;
        while (n > 1)
        {
            factorial *= n;
            n--;
        }
        System.out.println("Factorial = " + factorial);
    }

}
