package com.java.spring.customer;

public class Payment {

	private String transicationId;
	private String mode;
	private String time;
	
	public String getTransicationId() {
		return transicationId;
	}
	public void setTransicationId(String transicationId) {
		this.transicationId = transicationId;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Payment [transicationId=" + transicationId + ", mode=" + mode + ", time=" + time + "]";
	}
	
	
}
