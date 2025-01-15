package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton()
    {

    }

    public CarSkeleton(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine()
    {
        return "Engine started";
    }

    public void drive()
    {
        runEngine();
        System.out.println("Drive is starting");
    }

    protected void runEngine()
    {
        System.out.println("Engine is running");
    }

    @Override
    public String toString()
    {
        return "Car Name: " + getName() +  " " + "Car Description: " + getDescription();
    }
}
