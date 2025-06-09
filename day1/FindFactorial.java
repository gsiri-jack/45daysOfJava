package day1;

import java.math.BigInteger;
import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Find factorial of a given number
		
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int fact=1;
		
		while (i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
		System.out.println(factorial(n));
		

	}
	
	public static int factorial(int n) {
		// Factorial with recursion
		if(n<=1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
		
	}
	//This method returns a big Integer factorial greater than 20;
	
	public static BigInteger bigNumberFact(int n) {
		int i=1;
		BigInteger fact= BigInteger.ONE;
		
		while (i<=n) {
			fact=fact.multiply(BigInteger.valueOf(i));
			i++;
		}
		return fact;
	}

}
