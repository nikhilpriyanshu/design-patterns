package com.nikhil.patterns.strategy;

public interface IPayment {
	public PaymentStatus makePayment(double amount);
}
