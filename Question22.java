package com.cozentus.JavaTask;

class Peerson {
    private String firstName;
    private String lastName;

    public Peerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Emmployee extends Peerson {
    private int employeeId;
    private String jobTitle;

    public Emmployee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class Question22 {
    public static void main(String[] args) {
        Peerson person = new Peerson("Gourish", "Bhagat");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        Emmployee employee = new Emmployee("Gourish", "Bhagat", 251, "Officer");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getEmployeeId());
    }
}
