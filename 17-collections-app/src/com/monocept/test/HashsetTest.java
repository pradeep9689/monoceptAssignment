package com.monocept.test;

import java.util.HashSet;

public class HashsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set=new HashSet<String>();
String s1=new String("hello");
set.add(s1);
System.out.println(s1.hashCode());
String s2=new String("Pradeep");
set.add(s2);
System.out.println(s2.hashCode());
String s3=new String("Patil");
set.add(s3);
System.out.println(s3.hashCode());
System.out.println(set);


	}

}
