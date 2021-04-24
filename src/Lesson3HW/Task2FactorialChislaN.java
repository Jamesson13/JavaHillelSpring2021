package Lesson3HW;
import java.util.Scanner;

public class Task2FactorialChislaN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your number ---> ");
        int n = scan.nextInt();
        int factorial = 1;
        for(int i = 1;i<=n;i++){
            factorial *= i;

        }
        System.out.println(factorial);


    }
}
