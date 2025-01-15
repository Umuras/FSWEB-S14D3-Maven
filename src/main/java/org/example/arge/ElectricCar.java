package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name,description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine()
    {
        System.out.println(getClass().getSimpleName());
        return "ElectricCar engine started";
    }

    @Override
    public void drive()
    {
        runEngine();
        System.out.println("ElectricCar's drive is starting");
    }

    @Override
    protected void runEngine()
    {
        System.out.println("ElectricCar's engine is running");
    }

    @Override
    public String toString()
    {
        return "{ ElectricCar " +
                "avgKmPerCharge: " + getAvgKmPerCharge() + " " +
                "batterySize: " + getBatterySize();
    }
}
