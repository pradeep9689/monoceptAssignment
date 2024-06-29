package com.monocept.interfaces;

import java.util.Collection;

import com.monocept.exception.DuplicateProductException;
import com.monocept.exception.ProductNotFoundException;
import com.monocept.model.Product;

public interface ProductOperations {
	 void addProduct(Product product) throws DuplicateProductException;
	    void updateProduct(String productId, Product updatedProduct) throws ProductNotFoundException;
	    void deleteProduct(String productId) throws ProductNotFoundException;
	    Product viewProduct(String productId) throws ProductNotFoundException;
	    Collection<Product> viewAllProducts();
}
