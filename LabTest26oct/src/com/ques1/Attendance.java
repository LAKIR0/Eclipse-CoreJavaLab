/*
 * program:to check the attendance
 * @author:Levis Kiro
 * @date:26/10/22
 */
//declaring pakage
package com.ques1;

import java.util.Scanner;

//declaring class
public class Attendance {

	
	//declaring first method
	public static void getDetails() {
	
	}
	
	//declaring  method printdetails
	public static void printDetails(float ch,float at) {
		System.out.println("----------------");
		System.out.println("total classes="+ch);
		System.out.println("classes attended="+at);
	}
	//declaring  method printdetails
	 public static void percentage(float ch,float at) {
		float pert=0.0f;
		System.out.println("----------------");
		pert=(at/ch)*100;
		System.out.println("attendance percentage="+pert);
		 if(pert>=75)
			 System.out.println("student can give the exam");
		 else
			 System.out.println("student cannot give the exam");
		
	}
	

	//start main
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaring variabels
		float classHeld=0.0f,attended=0.0f;
		
		//taking input
		System.out.println("enter total number of classes held");
		classHeld=sc.nextFloat();
		System.out.println("enter the classes attended");
		attended=sc.nextFloat();
		
		
		//calling print details
		percentage(classHeld,attended);
		
		//calling print details
		printDetails(classHeld,attended);
		sc.close();
	}//end main

}//end class
