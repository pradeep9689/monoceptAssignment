package com.monocept.model;

import java.util.Date;

public class Transaction {

	private int transactionId;
	private int senderAccountId;
	private int receiverAccountId;
	private double amount;
	private String type;
	private Date date;

	// Getters and setters
	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getSenderAccountId() {
		return senderAccountId;
	}

	public void setSenderAccountId(int senderAccountId) {
		this.senderAccountId = senderAccountId;
	}

	public int getReceiverAccountId() {
		return receiverAccountId;
	}

	public void setReceiverAccountId(int receiverAccountId) {
		this.receiverAccountId = receiverAccountId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}