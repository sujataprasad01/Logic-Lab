package Day1;

import java.util.Scanner;
import java.util.*;
public class FrequencyOfLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.next();
		countFreq(str);
	}
	
	public static void countFreq(String str) {
		TreeMap<Character, Integer> mpp=new TreeMap<>(Collections.reverseOrder());
		
		for(char i:str.toCharArray()) {
			if(i>='a' && i<='z') {
				mpp.put(i, mpp.getOrDefault(i, 0)+1);
			}
		}
		
		for(Map.Entry<Character, Integer> e: mpp.entrySet()) {
			System.out.print(e.getKey()+":"+e.getValue()+" ");
		}
	}
}
