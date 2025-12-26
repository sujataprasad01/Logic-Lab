package Day2;

import java.util.Collection;
import java.util.Scanner;
import java.util.*;

public class FreqOfWord {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		
		countWords(str);
	}
	
	public static void countWords(String str) {
		String[] arr=str.split(" ");
		Map<String, Integer> mpp=new TreeMap<>(Collections.reverseOrder());
		
		for(int i=0; i<arr.length; i++) {
			mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<String, Integer> e:mpp.entrySet()) {
			System.out.println(e.getKey() + ": " +e.getValue() );
		}
	}

}
