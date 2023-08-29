package com.cozentus.JavaTask;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
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

class Employee extends Person {
    private int empId;
    private String jTitle;

    public Employee(String firstName, String lastName, int empId, String jTitle) {
        super(firstName, lastName);
        this.empId = empId;
        this.jTitle = jTitle;
    }

    public int getEmployeeId() {
        return empId;
    }

    public String getLastName() {
        return super.getLastName() + ", " +jTitle;
    }
}
public class Question8 {
	public static void main(String[] args) {
		
	      Employee emp = new Employee("Gourish", "Bhagat", 251, "Officer");
	      System.out.println(emp.getEmployeeId()+" - "+ emp.getFirstName() + " " + emp.getLastName());
	    }
}
