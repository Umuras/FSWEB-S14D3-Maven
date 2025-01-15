package org.example.arge;


public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name,description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine()
    {
        System.out.println(getClass().getSimpleName());
        return "GasPoweredCar engine started";
    }

    @Override
    public void drive()
    {
        runEngine();
        System.out.println("GasPoweredCar's drive is starting");
    }

    @Override
    protected void runEngine()
    {
        System.out.println("GasPoweredCar engine is running");
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                '}';
    }
}
