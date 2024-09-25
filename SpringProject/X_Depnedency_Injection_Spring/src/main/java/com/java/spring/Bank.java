package com.java.spring;

public class Bank {
	
	private String name;
	private double roi;
	private String mainBranch;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public String getMainBranch() {
		return mainBranch;
	}
	public void setMainBranch(String mainBranch) {
		this.mainBranch = mainBranch;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", roi=" + roi + ", mainBranch=" + mainBranch + "]";
	}
	
}
