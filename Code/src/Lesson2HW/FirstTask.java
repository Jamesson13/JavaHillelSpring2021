package Lesson2HW;

public class FirstTask {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(args.length);
        for (String str : args){
            System.out.println(str);
            int i = Integer.valueOf(str);
            sum+=i;
        }
        System.out.println("Среднее значение 2х чисел --->" + sum/2);
    }
}
