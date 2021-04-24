package Lesson10HW.Task3;

import java.util.Scanner;

public class Koren {
    public double sqrtWithMath(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number ---> ");
        int number = scan.nextInt();
        double res = Math.sqrt(number);
        return res;
    }


    //Метод Ньютона (касательных) для поиска корней
    public double sqrtWithoutMath() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number ---> ");
        int number = scan.nextInt();
        double t;
        double answer = number / 2;
        do {
            t = answer;
            answer = (t + (number / t)) / 2;
        } while ((t - answer) != 0);
        return answer;
    }
}
class Result{
    public static void main(String[] args) {
        Koren kor = new Koren();

        //System.out.println(kor.sqrtWithMath());
        System.out.println(kor.sqrtWithoutMath());
    }
}
