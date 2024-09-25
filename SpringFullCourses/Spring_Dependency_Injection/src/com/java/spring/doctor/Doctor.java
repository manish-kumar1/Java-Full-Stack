package com.java.spring.doctor;

public class Doctor {

	private String id;
	private String name;
	private static final int fees = 400;
	private String qualification;
	private String specilization;
	
	private Address address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static int getFees() {
		return fees;
	}

	public void displayInfo() {
		System.out.println();
		System.out.println("Id:  "+id);
		System.out.println("Name:  "+name);
		System.out.println("Fees:  "+fees);
		System.out.println("Qualification:  "+qualification);
		System.out.println("Specilization:  "+specilization);
		
		System.out.println("Address:  "+address.toString());
	}
}
