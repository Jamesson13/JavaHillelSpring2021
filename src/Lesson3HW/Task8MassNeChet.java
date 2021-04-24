package Lesson3HW;
public class Task8MassNeChet {
    public static void main(String[] args) {
        int [] mass = new int[10];
        int number =1;

        for(int i = 0;i<mass.length;i++){
            if (number%2==1){
                mass[i]=number;
                number=number+2;
            }else if(number%2==0){
                number=number+1;
                mass[i]=number;
            }
            System.out.print(mass[i] + " ");

        }
    }
}
