package com.kodnest.constuctorprogramming;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter purchase amount");
			double purchaseamount=scan.nextDouble();
			System.out.println("Enter the tax rate");
			double taxrate=scan.nextDouble();
			System.out.println("The total cost is "+calculateTotalWithTax(purchaseamount, taxrate));
		
	
		}
		
	public static double calculateTotalWithTax(double purchaseamount, double taxrate) 
	{
		
		double taxamount= purchaseamount*taxrate;
		return purchaseamount+taxamount;
	}
		
	}
		

	

