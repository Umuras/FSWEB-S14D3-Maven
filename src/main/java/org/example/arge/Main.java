package org.example.arge;

public class Main {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new CarSkeleton("Mitsubishi-ZX400","This car is very expensive");
        System.out.println(carSkeleton.startEngine());
        carSkeleton.drive();
        System.out.println(carSkeleton);

        CarSkeleton gasPoweredCar = new GasPoweredCar("Subaru-70S","Fast Car",4.2,4);
        System.out.println(gasPoweredCar.startEngine());
        gasPoweredCar.drive();
        System.out.println(gasPoweredCar);

        CarSkeleton hybridCar = new HybridCar("Toyota-40M","Hybrid Car",3.4,200000,4);
        System.out.println(hybridCar.startEngine());
        hybridCar.drive();
        System.out.println(hybridCar);

        ElectricCar electricCar = new ElectricCar("Tesla-S","Newest Model",405,250000);
        System.out.println(electricCar.startEngine());
        electricCar.drive();
        System.out.println(electricCar);
    }
}
