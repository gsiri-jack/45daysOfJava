package day1;

import java.util.Scanner;

public class ReverseString {
	// To reverse a String

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println(res); 

	}

}
