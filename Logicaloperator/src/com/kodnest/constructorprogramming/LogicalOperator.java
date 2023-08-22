package com.kodnest.constructorprogramming;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid(true/false)");
		boolean isValidInput=scan.nextBoolean();
		System.out.println("Does Input meet a certain condition(true/false)");
		boolean meetscondition=scan.nextBoolean();
		if(isValidInput&&meetscondition==true) {
			System.out.println("Input is valid");
		}else {
			System.out.println("Input is invalid");
		}

	}
	public static boolean isValidInput(boolean isValidInput,boolean meetscondition) {
		return isValidInput&&meetscondition;
	}

	}


