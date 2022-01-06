package com.nikhil.patterns.strategy;

public class UPIPayment implements IPayment {
	String upiId;

	public UPIPayment(String upiId) {
		this.upiId = upiId;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	@Override
	public PaymentStatus makePayment(double amount) {
		System.out.println("Making UPI Payment");
		return new PaymentStatus(Status.SUCCESS, "Payment Successful");
	}

}
