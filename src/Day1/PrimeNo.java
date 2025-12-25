package Day1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=sc.nextInt();
		boolean result=primeOrNot(num);
		if(result==false) {
			System.out.println(num + " is not a Prime number");
		}else {
			System.out.println(num + " is a Prime number");
		}

	}

public static boolean primeOrNot(int num) {
	if(num<=1) {
		return false;
	}
	for(int i=2; i<num; i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
}