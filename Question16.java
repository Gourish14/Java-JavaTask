package com.cozentus.JavaTask;

abstract class Employyee{
	
	protected int empID;
	protected String name;
	
	public Employyee(int empID, String name) {
		this.empID = empID;
		this.name = name;
	}

	public abstract float calculateSalary();
	public abstract void displayInfo();
}

class Manager extends Employyee{
	
	float managersalary;
	public Manager(int empID, String name, float managersalary) {
		super(empID, name);
		this.managersalary=managersalary;
	}
	
	public float calculateSalary() {
		return managersalary;
	}
	
	public void displayInfo() {
		System.out.println("Manager ID : "+empID);
		System.out.println("Manager Name : "+name);
		System.out.println("Man-Salary : "+calculateSalary());
	}
}

class Programmer extends Employyee{
	
	float prosalary;
	public Programmer(int empID, String name, float prosalary) {
		super(empID, name);
		this.prosalary=prosalary;
	}
	
	public float calculateSalary() {
		return prosalary;
	}
	public void displayInfo() {
		System.out.println("Programmer ID : "+empID);
		System.out.println("Programmer Name : "+name);
		System.out.println("Pro-Salary : "+calculateSalary());
	}
}

public class Question16 {
	public static void main(String [] args) {
		Employyee em = new Manager(251,"Gourish",25000);
		Employyee ep = new Programmer(207,"Raj",30000);
		em.displayInfo();
		System.out.println();
		ep.displayInfo();
	}
}
