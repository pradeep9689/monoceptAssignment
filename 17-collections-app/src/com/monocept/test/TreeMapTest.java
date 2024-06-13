package com.monocept.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> hm=new TreeMap<Integer,String> ();
		
		hm.put(1,"pradeep");
		
		
		hm.put(2,"prateek");
		
		
		hm.put(3,"suyesh");
		
		System.out.println(hm);
		Set<Map.Entry<Integer,String> >set=hm.entrySet();
		for(Map.Entry map:set) {
			System.out.println(map.getKey()+"---"+map.getValue());
		}
	}

}
