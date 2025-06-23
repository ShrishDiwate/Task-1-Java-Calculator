package com.elevateLabs;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("******************************");
		System.out.print("Enter the 1st number : ");
		double n1= sc.nextDouble();
		System.out.print("Enter the operation (+ , - , * , /) : ");
		char operator = sc.next().charAt(0);
		System.out.print("Enter the 2nd number : ");
		double n2 = sc.nextDouble();
		System.out.println("******************************");
		
		double result = 0;
		boolean valid = true;
		
		
		try {
			switch (operator) {
			case '+':
				result = calc.add(n1, n2);
				break;
				
			case '-':
				result = calc.subtract(n1, n2);
				break;
				
			case '*':
				result = calc.multiply(n1, n2);
				break;
				
			case '/':
				result = calc.divide(n1, n2);
				break;
				
			default:
				System.out.println("Invalid Operator");
				valid = false;
			
			}
			
			 if (valid) {
	                System.out.println("Result: " + result);
	            }
		}catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		
		
		
		
		sc.close();
	}

}

