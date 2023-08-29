package com.cozentus.JavaTask;

class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fueltype;

    public Vehicle(String make, String model, int year, String fueltype) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fueltype = fueltype;
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

    public String getFueltype() {
        return fueltype;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fueltype);
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }
}

public class Question7 {
    public static void main(String[] args) {
    	
        Car myCar = new Car("BMW", "Q7", 2023, "Petrol");
        myCar.displayInfo();
        System.out.println();
        Truck myTruck = new Truck("Volvo", "Legender", 2018, "Diesel");
        myTruck.displayInfo();
        System.out.println();
        Motorcycle myMotorcycle = new Motorcycle("Ducati Panigale", "V4", 2023, "Petrol");
        myMotorcycle.displayInfo();
    }
}

