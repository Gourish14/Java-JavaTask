package com.cozentus.JavaTask;

class Emplloyee {
    private String name;
    private double salary;

    public Emplloyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManagerr extends Emplloyee {
    public HRManagerr(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("HR Work");
    }

    public void addEmployee() {
        System.out.println("HR adding Employee");
    }
}

public class Question24 {
    public static void main(String[] args) {
        Emplloyee employee = new Emplloyee("Gourish", 50000);
        employee.work();
        System.out.println("Salary: " + employee.getSalary());

        HRManagerr hrManager = new HRManagerr("Raj", 80000);
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("Salary: " + hrManager.getSalary());
    }
}

