package Day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str=sc.next();
		String rev=reverseStr(str);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

	public static String reverseStr(String str) {
		char[] chArr=str.toCharArray();
		
		int start=0;
		int end=chArr.length-1;
		while(start<end) {
				char temp=chArr[start];
				chArr[start]=chArr[end];
				chArr[end]=temp;
				start++;
				end--;
		}
		return(new String(chArr));
	}
}
