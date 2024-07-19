package com.monocept.model;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private int senderAccNo;
    private int receiverAccNo;
    private String type;
    private double amount;
    private Date date;
	public Transaction(int transactionId, int senderAccNo, int receiverAccNo, String type, double amount, Date date) {
		super();
		this.transactionId = transactionId;
		this.senderAccNo = senderAccNo;
		this.receiverAccNo = receiverAccNo;
		this.type = type;
		this.amount = amount;
		this.date = date;
	}
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getSenderAccNo() {
		return senderAccNo;
	}
	public void setSenderAccNo(int senderAccNo) {
		this.senderAccNo = senderAccNo;
	}
	public int getReceiverAccNo() {
		return receiverAccNo;
	}
	public void setReceiverAccNo(int receiverAccNo) {
		this.receiverAccNo = receiverAccNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

   
}

