package Lesson4HW;
public class Main {
    public static void main(String[] args) {
        double spentFuel = 0;

        Car car = new Car(60,5,11);
        spentFuel += car.fullVolume();
        if(car.movement(331) == false){
            return;
        }
        spentFuel+= car.fullVolume();
        if (car.movement(344) == false){
            return;
        }
        spentFuel+= car.fullVolume();
        if(car.movement(142)==false){
            return;
        }
        System.out.println("Money for the trip ----> "+ spentFuel * Integer.parseInt(args[0]) + "uah");
        double tankResidue = car.GetTankResidue();
        System.out.println("Fuel at the end -----> "+ tankResidue);


    }
}
