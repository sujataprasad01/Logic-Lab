package Day2;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse().toString());

	}

}
