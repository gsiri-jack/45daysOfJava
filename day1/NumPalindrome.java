package day1;

import java.util.Scanner;

public class NumPalindrome {

	public static void main(String[] args) {
		// TODO Check weather a number is palindrome or not 
		
		Scanner	sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int res=0;
		while(temp>0) {
			int rem = temp%10;
			res = res*10 + rem;
			temp=temp/10;
			
		}
		if(res==num) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		sc.close();

	}

}
