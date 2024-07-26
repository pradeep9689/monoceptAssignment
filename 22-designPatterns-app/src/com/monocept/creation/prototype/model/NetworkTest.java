package com.monocept.creation.prototype.model;

public class NetworkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NetworkConnection network=new NetworkConnection();
network.setIp("192.168.4.4");
network.loadData();
System.out.println(network);
try {
	NetworkConnection network1=(NetworkConnection)network.clone();
	System.out.println(network1);
} catch (CloneNotSupportedException e) {

	e.printStackTrace();
}

	}
	
}
