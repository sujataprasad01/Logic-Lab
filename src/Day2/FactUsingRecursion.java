package Day2;

import java.util.Scanner;

public class FactUsingRecursion {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	
	public static long fact(int n) {
		if(n<=1) return 1;
		return n*fact(n-1);
	}
}
