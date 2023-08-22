package com.kodnest.constructorprogramming;

import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter the operator");
		char operator=scan.next().charAt(0);
		switch(operator)
		{
		case'+':
			System.out.println(num1+num2);
			break;
		case'-':
			System.out.println(num1-num2);
			break;
		case'*':
			System.out.println(num1*num2);
			break;
		case'/':
			System.out.println(num1/num2);
			break;
		case'%':
			System.out.println(num1%num2);
			break;
			default:
				System.out.println("check operator");
		}	


	}

}
