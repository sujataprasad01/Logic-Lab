package Day2;

import java.util.Scanner;

public class SecondLarget {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size=sc.nextInt();
		System.out.print("Enter "+ size +" values : ");
		int[] arr=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]!=largest){
				secondLargest=arr[i];		
			}
		}
		System.out.println(secondLargest);
	}

}
