package Day1;

import java.util.Scanner;

public class ReverseStrSkipNonLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String with non-letters too : ");
		String str=sc.next();
		reverseStr(str);
	}
	
	public static void reverseStr(String str) {
		char[] chArr=str.toCharArray();
		
		int start=0;
		int end=chArr.length-1;
		while(start<end) {
			if(!Character.isLetter(chArr[start])) {
				start++;
			}else if(!Character.isLetter(chArr[end])) {
				end--;
			}else {
				char temp=chArr[start];
				chArr[start]=chArr[end];
				chArr[end]=temp;
				start++;
				end--;
			}
		}
		System.out.print(new String(chArr));
	}

}
