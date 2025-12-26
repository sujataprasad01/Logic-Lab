package Day2;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size=sc.nextInt();
		int[] arr= new int[size];
		System.out.print("Enter the array values : ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int evenSum=0;
		int oddSum=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evenSum=evenSum+arr[i];
			}else {
				oddSum=oddSum+arr[i];
			}
		}
		System.out.println("Sum of Even : "+ evenSum);
		System.out.println("Sum of Odd : "+ oddSum);
	}

}
