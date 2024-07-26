package com.monocept.creation.prototype.model;

public class NetworkConnection implements Cloneable{
private String ip;
private String data;
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public void loadData() {
	this.data="Important Data";
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
public String toString() {
	return "NetworkConnection ip=" + ip + ", data=" + data ;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}



}
