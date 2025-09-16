package com.tns.nonaccessmodifier;

public class Trainer {
	int id;
	String name;
	String designation;
	String city;

	public Trainer() {
		this.id=0;
		this.name="Unknown";
		this.designation="Unassigned";
		this.city="N/A";
		System.out.println("Trainer object  created.");
	}
	
	public Trainer(int id, String name, String designation, String city) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.city=city;
	}
	
	public void displayTrainerDetails() {
		System.out.println("ID:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Designation:"+this.designation);
		System.out.println("City:"+this.city);
	}
	
	public static void main(String[]args) {
		Trainer trainer1 = new Trainer(101, "Alice Smith", "Senior Developer", "Bengaluru");
		Trainer trainer2 = new Trainer(102, "Bob Johnson", "AI Engineer", "Delhi");
		Trainer trainer3 = new Trainer(103, "Charlie Brown", "Data Analyst", "Mumbai");
		
		System.out.println("Trainer Details:");
		trainer1.displayTrainerDetails();
		trainer2.displayTrainerDetails();
		trainer3.displayTrainerDetails();
	}

}
