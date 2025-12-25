package Day1;
import java.util.*;
public class SmallestEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size=sc.nextInt();
		int[] arr= new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter a number : ");
			arr[i]=sc.nextInt();
		}
		
		int smallest=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
		

	}

}
