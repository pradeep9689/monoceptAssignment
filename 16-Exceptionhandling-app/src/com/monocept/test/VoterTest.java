package com.monocept.test;

import com.monocept.Exceptions.AgeNotValidException;
import com.monocept.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Voter voter1=new Voter(23,"pradeep");
		voter1.vote();
		Voter voter2=new Voter(16,"Atish");
		voter2.vote();
		}
		catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
	}

}
