package day1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		String st = sc.next();
		char[] arr = st.toCharArray();
		int i=0;
		int  j=arr.length-1;
		while(i<j) {
			char temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		String res = new String(arr);
		if(st.equals(res)) {
			System.out.println("A palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		sc.close();

	}

}
