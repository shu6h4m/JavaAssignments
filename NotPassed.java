/*
Write a program to input the name, subject,
and marks of a student. The program throw a
user-defined exception "NotPassed" 
if the entered marks are less than 40.
*/

import java.io.*;
public class NotPassed {	
		public static void main(String args[])throws Exception{  
		  
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		//Taking User Input  
		System.out.println("Enter Name : ");  
		String name=br.readLine();		 
		System.out.println("Enter Subject : ");  
		String subject=br.readLine();
		System.out.println("Enter Your Marks : ");  
		String marks=br.readLine();
		//Printing the results
		System.out.println("\n______________________\n");
		System.out.println("Welcome "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Marks : "+marks);		
		if(Float.valueOf(marks)<40) System.out.println("Not Passed"); 
		else System.out.println("Passed");
		System.out.println("\n______________________\n");
		 }  
	}
