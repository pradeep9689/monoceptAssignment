package com.monocept.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest {

	public static void main(String[] args) {
		 int charCount = 0;
	      int lineCount=0;
	     int countwords=0;
		// TODO Auto-generated method stub
		 try {
			
		     
		      FileReader fileInputStream = new FileReader("D:\\Pradeep\\06-stream-app\\src\\com\\monocept\\stream\\test");
		     
		      int ch;
		      
		      while ((ch = fileInputStream.read()) != -1) {
		    	 
		    	  charCount++;
		        System.out.print((char) ch);
		        if (ch == '\n') {
                    lineCount++;
                }
		        if(((char)ch=='\n' || (char)ch=='\t' || (char)ch==' ')) {
		        	countwords++;
		        
		        }
	
		      }
		     

		     
		      fileInputStream.close();

		    } catch (IOException e) {
		      System.err.println("Error: An error occurred while reading the file: " + e.getMessage());
		    }
		 System.out.println("\nLine Count: " + lineCount);
		 System.out.println("Character Count: " + charCount);
		 System.out.println("word Count: " + countwords++);
		 
	}

}
