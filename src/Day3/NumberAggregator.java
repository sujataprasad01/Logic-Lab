package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAggregator {
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ArrayList<Integer> list = new ArrayList<>();

	        System.out.println("Enter numbers (-999 to stop):");

	        while(true) {
	            int n = sc.nextInt();

	            if(n == -999)
	                break;

	            list.add(n);
	        }

	        int[] arr = new int[list.size()];
	        for(int i=0;i<list.size();i++)
	            arr[i] = list.get(i);

	        System.out.println("Count = " + arr.length);
	        System.out.println("Min = " + min(arr));
	        System.out.println("Max = " + max(arr));
	        System.out.println("Average = " + average(arr));
	        System.out.println("Median = " + median(arr));
	        System.out.println("Mode = " + mode(arr));
	    }

	    public static int min(int[] arr) {
	    	int smallest=Integer.MAX_VALUE;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]<smallest) {
					smallest=arr[i];
				}
			}
			return smallest;
	    }

	    public static int max(int[] arr) {
	    	int largest=Integer.MIN_VALUE;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>largest) {
					largest=arr[i];
				}
			}
			return largest;
	    }

	    public static double average(int[] arr) {
	    	double avg=0;
	    	int total=0;
			for(int i=0; i<arr.length; i++) {	
				total=total+arr[i];
			}
			avg=total/arr.length;
			return avg;
	    }

	    public static double median(int[] arr) {
int start=arr[0];
int end=arr[arr.length-1];
double mid=0;
if(arr.length%2!=0) {
	 mid=start+(start-end)/2;
	return mid;
}else {
	mid=(arr[arr.length/2-1]+arr[arr.length/2])/2.0;
	return mid;
}
	    }

	    public static int mode(int[] a) {
	    	 int maxCount = 0;
	    	    int mode = a[0];

	    	    for(int i = 0; i < a.length; i++) {
	    	        int count = 0;

	    	        for(int j = 0; j < a.length; j++) {
	    	            if(a[j] == a[i]) {
	    	                count++;
	    	            }
	    	        }

	    	        if(count > maxCount) {
	    	            maxCount = count;
	    	            mode = a[i];
	    	        }
	    	    }

	    	    return mode;
	    }
}
