package com.gravypod.Factorial;

import java.math.BigInteger;
import java.util.Scanner;


public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What number do you want the factorial of?");
		
		System.out.println(factorial(BigInteger.valueOf(sc.nextInt())));
		
	}
	
	public static BigInteger factorial(BigInteger number) {
		
		if (number.intValue() == 0) {
			return BigInteger.ONE;
		}
		
		return number.multiply(factorial(number.subtract(BigInteger.ONE)));
		
	}
	
	
}
