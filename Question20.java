package com.cozentus.JavaTask;

class Vehhicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehhicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0.0;
    }

    public double calculateDistanceTraveled(double fuelAmount) {
        return fuelAmount / calculateFuelEfficiency();
    }

    public int getMaxSpeed() {
        return 0;
    }
}

class Truckk extends Vehhicle {
    private double cargoCapacity;

    public Truckk(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8.5; // Example value for fuel efficiency (miles per gallon) of a truck
    }

    @Override
    public int getMaxSpeed() {
        return 75; // Example value for the maximum speed of a truck
    }
}

class Ccar extends Vehhicle {
    private boolean isSedan;

    public Ccar(String make, String model, int year, String fuelType, boolean isSedan) {
        super(make, model, year, fuelType);
        this.isSedan = isSedan;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 30.0; // Example value for fuel efficiency (miles per gallon) of a car
    }

    @Override
    public int getMaxSpeed() {
        return 120; // Example value for the maximum speed of a car
    }
}

class Motorrcycle extends Vehhicle {
    private boolean hasSidecar;

    public Motorrcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 50.0; // Example value for fuel efficiency (miles per gallon) of a motorcycle
    }

    @Override
    public int getMaxSpeed() {
        return 150; // Example value for the maximum speed of a motorcycle
    }
}

public class Question20 {
    public static void main(String[] args) {
        Truckk truck = new Truckk("Ford", "F-150", 2022, "Diesel", 1500);
        Ccar car = new Ccar("Toyota", "Corolla", 2022, "Gasoline", true);
        Motorrcycle motorcycle = new Motorrcycle("Harley-Davidson", "Sportster", 2022, "Gasoline", false);

        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Motorcycle Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");

        double fuelAmount = 20.0;
        System.out.println("Truck can travel " + truck.calculateDistanceTraveled(fuelAmount) + " miles with " + fuelAmount + " gallons of fuel.");

        System.out.println("Max Speed of Truck: " + truck.getMaxSpeed() + " mph");
        System.out.println("Max Speed of Car: " + car.getMaxSpeed() + " mph");
        System.out.println("Max Speed of Motorcycle: " + motorcycle.getMaxSpeed() + " mph");
    }
}

