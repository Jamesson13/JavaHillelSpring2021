package Lesson4HW;
public class Car {


        private int volume = 60;
        private double tankResidue = 5;
        private int fuelConsumption = 11;





    public Car(int _volume,double _tankResidue,int _fuelConsumption) {
        volume=_volume;
        tankResidue = _tankResidue;
        fuelConsumption= _fuelConsumption;


    }
    public double GetTankResidue(){
        return tankResidue;
    }

    public boolean movement(double distance){
        if(tankResidue-(distance/100*fuelConsumption)>0){
          tankResidue = tankResidue -(distance/100*fuelConsumption);
            return true;
        }
            return false;

    }

    public  double fullVolume (){
        double requiredFuel = volume - tankResidue;
        tankResidue = requiredFuel + tankResidue;
        return requiredFuel;
    }

    public double residueAfterRun (double distance){
        tankResidue = tankResidue-(distance/100*fuelConsumption);
        return tankResidue;
    }

    public double refueling(double distance){
        double fuelNeed = volume - (distance/100*fuelConsumption);
        return  fuelNeed;
    }



}
