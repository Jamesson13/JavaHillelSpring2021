package Lesson2HW;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.print("Введите сумму депозита =>");
        Scanner scan = new Scanner(System.in);
        double deposit = scan.nextDouble();
        System.out.print("Введите колличество лет =>");
        Scanner scan1 = new Scanner(System.in);
        int years = scan1.nextInt();
        System.out.print("Укажите процентную ставку =>");
        Scanner scan2 = new Scanner(System.in);
        double percent = scan2.nextDouble();
        int months = years*12;
        double montlyPercent = percent/12;


        for (int i = 1; i<=months; i++ ){
            double afterMonthDeposit = deposit/100*montlyPercent + deposit;
            deposit = afterMonthDeposit;
            System.out.println(afterMonthDeposit);
        }

    }
}
