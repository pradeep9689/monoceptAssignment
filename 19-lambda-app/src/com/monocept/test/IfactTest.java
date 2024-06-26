package com.monocept.test;

import java.util.function.Consumer;

import com.monocept.model.Ifact;

public class IfactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer=(number)-> { 
		      int ans = 1;
		      for(int i=2;i<=number;i++) {
		        ans *= i;
		      }
		      System.out.println(ans);
		    };
		    
		    consumer.accept(5);
		  }
		}
