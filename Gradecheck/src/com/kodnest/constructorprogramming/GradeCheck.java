package com.kodnest.constructorprogramming;

import java.util.Scanner;

public class GradeCheck {

	
		public static void checkGrade(int grade)

		{

		if(grade>50) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		}

		public static void main(String[] args)

		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your grade");
			int grade=scan.nextInt();
			checkGrade(grade);


	}

}
