package com.cozentus.JavaTask;

class Vehiccle {
    public void startEngine() {
        System.out.println("Starting the engine of the vehicle");
    }

    public void stopEngine() {
        System.out.println("Stopping the engine of the vehicle");
    }
}

class Caar extends Vehiccle {

    public void startEngine() {
        System.out.println("Starting the car's engine");
    }

    public void stopEngine() {
        System.out.println("Stopping the car's engine");
    }
}

class Motorcyccle extends Vehiccle {

    public void startEngine() {
        System.out.println("Starting the motorcycle's engine");
    }

    public void stopEngine() {
        System.out.println("Stopping the motorcycle's engine");
    }
}

public class Question18 {
    public static void main(String[] args) {
        Vehiccle vehicle = new Vehiccle();
        vehicle.startEngine();
        vehicle.stopEngine();

        Caar car = new Caar();
        car.startEngine();
        car.stopEngine();

        Motorcyccle motorcycle = new Motorcyccle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

