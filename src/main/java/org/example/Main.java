package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(4,"Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car holden = new Holden(4,"VZ");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Car ford = new Ford(4,"Focus");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        if(ford.equals(holden))
        {
            System.out.println("Two cars are same");
        }else {
            System.out.println("Two cars aren't same");
        }

        //Taban sınıfa kendisi ve türemiş sınıfı atayabilirsin.
        //Türemiş sınıfa sadece kendisini atayabilirsin.
        //Türemiş sınıfa taban sınıfı atayamazsın.
        //Sol taraf taban sağ taraf türemiş olunca instance'ı türemiş sınıfa cast edebilirsin.
        //Sol taraf taban sağ taraf türemiş olduğunda türemiş sınıftaki sadece taban sınıfından
        //override edilmiş methodlara erişebilirsin.
        Car testCar = new Car(4,"TestCar");
        Ford testCar2 = new Ford(4,"TestFord");
        Car testCar3 = new Ford(6,"TestFord3");
        Car p = (Ford)testCar3;
    }

    public static void testCar(Car car)
    {
        if(car instanceof Mitsubishi)
        {
            System.out.println("This car is Mitsubishi");
        }else if(car instanceof Holden)
        {
            System.out.println("This car is Holden");
        }else if(car instanceof Ford)
        {
            System.out.println("This car is Ford");
        }else{
            System.out.println("Wrong car");
        }
    }
}