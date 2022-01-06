package com.nikhil.patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<CartItem> cartItems;
	double amount;

	public ShoppingCart() {
		this.cartItems = new ArrayList<CartItem>();
		this.amount = 0.0D;
	}

	public void addCartItem(CartItem cartItem) {
		this.cartItems.add(cartItem);
	}

	public void removeCartItem(CartItem cartItem) {
		this.cartItems.remove(cartItem);
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void calculateAmount() {
		amount = 0.0D;
		for (CartItem cartItem : cartItems) {
			amount += cartItem.getAmount();
		}
	}

	public PaymentStatus makePayment(IPayment payment) {
		return payment.makePayment(this.amount);
	}
}
