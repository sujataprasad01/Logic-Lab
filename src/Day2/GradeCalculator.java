package Day2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter marks for 5 subjects : ");
		int[] arr=new int[5];
		for(int i=0; i<5; i++) {
			arr[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0; i<arr.length; i++) {
			total=total+arr[i];
		}
		double ans=(total/500.0)*100;
		
		System.out.println("Percentage = " +ans);
		
		if(ans>=90) {
			 System.out.println("Grade : A");
		}else if(ans>=75) {
			 System.out.println("Grade : B");
		} else if (ans >= 60) {
            System.out.println("Grade : C");
        }else if (ans >= 40) {
            System.out.println("Grade : D");
        }else {
            System.out.println("Grade : Fail");
        }
		
	}

}
