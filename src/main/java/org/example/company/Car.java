package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine()
    {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate()
    {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake()
    {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }



    @Override
    public String toString()
    {
        return "Car name: " + getName() + " "
                + "Car wheels: " + this.wheels + " "
                + "Car cylinders: " + getCylinders();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == this)
        {
            return true;
        }

        if(!(obj instanceof Car))
        {
            return false;
        }

        return ((Car)obj).name.equals(getName()) && ((Car)obj).cylinders == getCylinders();

    }


}
