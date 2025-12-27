package Day3;

import java.util.*;
import java.util.Scanner;

public class CompressedRLE {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	        int choice;
	        System.out.println("Enter a string containing letters only : ");
	        String str=sc.next();
	        while(true) {

	            System.out.println("\n RLE Compression Menu");
	            System.out.println("1) Compress");
	            System.out.println("2) Decompress");
	            System.out.println("3) Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch(choice) {
	            case 1:
	            	compress(str);
	            	break;
	            case 2:
	            	decompress(str);
	            	break;
	            case 3:
	            	System.out.println("Existing...");
	            	System.exit(0);
	            }

	}
	}
	
	public static void compress(String str) {
		char[] arr=str.toCharArray();
		Map<Character, Integer> mpp=new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Character, Integer> e: mpp.entrySet()) {
			System.out.print(e.getKey()+""+e.getValue());
		}
	}
	
public static void decompress(String str) {
	char[] arr=str.toCharArray();
	Map<Character, Integer> mpp=new HashMap<>();
	
	for(int i=0; i<arr.length; i++) {
		mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
	}
	for(Map.Entry<Character, Integer> e: mpp.entrySet()) {
		for(int j=0; j<e.getValue(); j++) {
			System.out.print(e.getKey());
		}
	}
	
	}

}
