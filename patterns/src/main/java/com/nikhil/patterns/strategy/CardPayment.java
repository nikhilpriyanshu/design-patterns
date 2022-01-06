package com.nikhil.patterns.strategy;

public class CardPayment implements IPayment{
	String cardNumber;
	String name;
	String cvv;
	String expiryDate;

	public CardPayment(String cardNumber, String name, String cvv, String expiryDate) {
		this.cardNumber = cardNumber;
		this.name = name;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public PaymentStatus makePayment(double amount) {
		System.out.println("Making Card Payment");
		return new PaymentStatus(Status.SUCCESS, "Payment Successful");
	}

	
}
