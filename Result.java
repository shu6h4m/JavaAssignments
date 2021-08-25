package mca_practicals;

import java.io.*;
public class Result {

	
		public static void main(String args[])throws Exception{  
		  
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		  
		System.out.println("Enter your name : ");  
		String name=br.readLine();  
		 
		System.out.println("Enter subject : ");  
		String subject=br.readLine();
		System.out.println("Enter your marks : ");  
		String marks=br.readLine();
		
		System.out.println("\n*****************Result*******************\n");
		System.out.println("Welcome "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Marks : "+marks);
		
		if(Float.valueOf(marks)<40) System.out.println("Not Passed"); 
		else System.out.println("Passed");
		 }  
		 
		

	}


