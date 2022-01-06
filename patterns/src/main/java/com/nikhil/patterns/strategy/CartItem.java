package com.nikhil.patterns.strategy;

public class CartItem {
	private String itemId;
	private double amount;

	public CartItem(String itemId, double amount) {
		this.itemId = itemId;
		this.amount = amount;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
