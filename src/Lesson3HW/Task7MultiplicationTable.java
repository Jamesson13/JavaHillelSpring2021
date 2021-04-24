package Lesson3HW;
import java.util.Scanner;

public class Task7MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add your number ---> ");
        int x = scan.nextInt();
        int array []= {1,2,3,4,5,6,7,8,9,10};
        int result;
        for (int i = 0; i <= array.length; i++) {
                result = array[i]*x;
                System.out.print(array[i] + "x" + x + "=" + result);
            System.out.println();

        }

    }

}
