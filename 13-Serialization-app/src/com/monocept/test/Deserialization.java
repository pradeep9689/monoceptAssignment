package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;


public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException {
		String fileName="D:\\Pradeep\\13-Serialization-app\\currentAccount.txt";
try {
	FileInputStream fileniputstream =new FileInputStream(fileName);
	ObjectInputStream objectinputstream =new ObjectInputStream(fileniputstream);
	CurrentAccount currentAccount1=(CurrentAccount)objectinputstream.readObject();
	System.out.println("Account Number: "+currentAccount1.getAccno());
	System.out.println("Account Holder Name: "+currentAccount1.getName());
	System.out.println("Balance: "+currentAccount1.getBalance());
	System.out.println("OverDraft Limit "+currentAccount1.getOverdraftLimit());
	
}
catch(FileNotFoundException e)
{
	e.printStackTrace();
}
catch(IOException e) 
{
	e.printStackTrace();
}
System.out.println();





String fileName1="D:\\Pradeep\\13-Serialization-app\\savingtAccount.txt";
try {
	FileInputStream fileniputstream1 =new FileInputStream(fileName1);
	ObjectInputStream objectinputstream1 =new ObjectInputStream(fileniputstream1);
	SavingsAccount savingaccount1=(SavingsAccount)objectinputstream1.readObject();
	System.out.println("Account Number: "+savingaccount1.getAccno());
	System.out.println("Account Holder Name: "+savingaccount1.getName());
	System.out.println("Balance: "+savingaccount1.getBalance());
	System.out.println("Minimum Balance "+savingaccount1.getMinBalance());
}
catch(FileNotFoundException e)
{
	e.printStackTrace();
}
catch(IOException e) 
{
	e.printStackTrace();
}
System.out.println();
	}

}
