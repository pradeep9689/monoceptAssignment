package com.monocept.interfaces;

import java.util.Collection;

import com.monocept.exception.DuplicateSupplierException;
import com.monocept.exception.SupplierNotFoundException;
import com.monocept.model.Supplier;

public interface SupplierOperations {
	void addSupplier(Supplier supplier) throws DuplicateSupplierException;
    void updateSupplier(String supplierId, Supplier updatedSupplier) throws SupplierNotFoundException;
    void deleteSupplier(String supplierId) throws SupplierNotFoundException;
    Supplier viewSupplier(String supplierId) throws SupplierNotFoundException;
    Collection<Supplier> viewAllSuppliers();
}
