package com.monocept.interfaces;

import java.util.List;

import com.monocept.exception.InsufficientStockException;
import com.monocept.exception.ProductNotFoundException;
import com.monocept.model.Transaction;

public interface TransactionOperations {
	void addStock(String productId, int quantity) throws ProductNotFoundException;
    void removeStock(String productId, int quantity) throws ProductNotFoundException, InsufficientStockException;
    List<Transaction> viewTransactionHistory(String productId);
}
