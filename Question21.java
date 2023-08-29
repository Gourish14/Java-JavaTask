package com.cozentus.JavaTask;

class Shappe {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Cirrcle extends Shappe {
    private double radius;

    public Cirrcle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Question21 {
    public static void main(String[] args) {
        Cirrcle circle = new Cirrcle(5.0);
        
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}

