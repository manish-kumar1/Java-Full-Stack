
package com.java.spring;

/**
 * 
 */
public class BankSBI {
	
	private String bankName;
	private String branchName;
	private double rateOfInterest;
	private final int widthrowalLimit = 100000;
	private Bank reservBank;
	
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	public Bank getReservBank() {
		return reservBank;
	}
	public void setReservBank(Bank reservBank) {
		this.reservBank = reservBank;
	}
	public String getBankName() {
		return bankName;
	}
	public int getWidthrowalLimit() {
		return widthrowalLimit;
	}
	public String getBranchName() {
		return branchName;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	@Override
	public String toString() {
		return "BankSBI [bankName=" + bankName + ", branchName=" + branchName + ", rateOfInterest=" + rateOfInterest
				+ ", widthrowalLimit=" + widthrowalLimit + "]";
	}
}
