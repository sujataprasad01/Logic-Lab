package Day2;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 'A' for CtoF");
		System.out.println("Enter 'B' for FtoC");
		String str=sc.next();
		
		System.out.println("Enter a Value to convert : ");
		int value=sc.nextInt();
		
		double result=tempCon(str, value);
		System.out.print(result);
		
	}
	
	public static double tempCon(String str, int value) {
		double ans=0;
		if(str.equals("A")) {
			ans=((value*(9.0/5))+32);
		}else{
			ans=(value-32)*(5.0/9);
		}
		return ans;
	}

}
