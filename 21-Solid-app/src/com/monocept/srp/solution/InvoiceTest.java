package com.monocept.srp.solution;

public class InvoiceTest 
{

	public static void main(String[] args)
	{
		 Invoice invoice = new Invoice(1, "Laptop Purchase", 1000);
	        
	        TaxCalculator taxCalculator = new TaxCalculator();
	          taxCalculator.calculateTax(invoice);
	     InvoicePrinter invoicePrinter = new InvoicePrinter();
	        invoicePrinter.printInvoice(invoice);
	    }
	}