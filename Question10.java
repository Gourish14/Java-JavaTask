package com.cozentus.JavaTask;

class Employeee {
    private int salary;

    public Employeee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee Work");
    }

    public int getSalary() {
        return salary;
    }
}

class HRManager extends Employeee {
    public HRManager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("Managing Work");
    }

    public void addEmployee() {
        System.out.println("Adding Employee");
    }
}

public class Question10 {
    public static void main(String[] args) {
        Employeee e = new Employeee(50000);
        e.work();
        System.out.println("Employee salary: " + e.getSalary());
        
        System.out.println();
        
        HRManager mgr = new HRManager(80000);
        mgr.work();
        mgr.addEmployee();
        System.out.println("Manager salary: " + mgr.getSalary());
        
    }
}
