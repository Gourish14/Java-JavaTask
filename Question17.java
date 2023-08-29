package com.cozentus.JavaTask;

class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a cylinder");
    }

    public double calculateArea() {
        return 2 * 3.14 * height + 2 * super.calculateArea();
    }
}

public class Question17 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        System.out.println("Shape area: " + shape.calculateArea());

        Circle circle = new Circle(5.0);
        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(3.0, 7.0);
        cylinder.draw();
        System.out.println("Cylinder area: " + cylinder.calculateArea());
    }
}
