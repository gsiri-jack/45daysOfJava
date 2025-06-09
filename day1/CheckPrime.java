package day1;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Check a number is prime or not
		
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = true;
		if(n<2) {
			prime = false;
		}else {
		for(int i=2; i<n; i++) {
			if (n%i == 0) {
				prime = false;
				break;
			}
		}}
		System.out.println(prime);

	}

}
