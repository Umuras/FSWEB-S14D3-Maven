package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine()
    {
        System.out.println(getClass().getSimpleName());
        return "HybridCar engine started";
    }

    @Override
    public void drive()
    {
        runEngine();
        System.out.println("HybridCar drive is starting");
    }

    @Override
    protected void runEngine()
    {
        System.out.println("HybridCar engine is running");
    }

    @Override
    public String toString()
    {
        return super.toString() + "{HybridCar avgKmPerLiter: " + getAvgKmPerLiter() +
                " " + "batterySize: " + getBatterySize() + " " +
                "Cylinders: " + getCylinders();
    }
}
