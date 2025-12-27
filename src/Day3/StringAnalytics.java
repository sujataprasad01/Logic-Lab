package Day3;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringAnalytics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line : ");
		String str=sc.nextLine();
		
		compute(str);
	}
	
	public static void compute(String str) {
		
		System.out.println("Words : "+ countWords(str));
		System.out.println("Sentences : "+ noOfSecntences(str));
		System.out.print("Digits : "+ countOfDigits(str) +", ");
		System.out.println("Letters : "+ countOfLetter(str));
		System.out.println("Longest word : "+ longest(str));
		freqOfVowels(str);
		
	}
	
	public static int noOfSecntences(String str) {
		
		int ans=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='?' || str.charAt(i)=='.'|| str.charAt(i)=='!') {
				ans++;
			}
		}
		return ans;
		
	}
	public static int countOfDigits(String str) {

		int ans=0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				ans++;
			}
		}
		return ans;
		
	}
	
	public static int countOfLetter(String str) {
		int letter=0;
		for(char i:str.toCharArray()) {
			if(Character.isLetter(i)) {
				letter++;
			}
		}
		return letter;
		
	}
	
	public static int countWords(String str) {
	
		  int count = 0;

		  boolean inWord = false;
		    for(int i=0; i<str.length(); i++){
		    	 char ch = str.charAt(i);

		         if (Character.isLetter(ch)) {
		             if (!inWord) {
		                 count++;        
		                 inWord = true;
		             }
		         } else {
		             inWord = false;     
		         }
		    }
		    return count;
	}
	
	public static String longest(String str) {

		String[] arr=str.split(" ");
		String ans=arr[0];
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr[i].length(); j++) {	
				count++;
			}
			if(ans.length()<count) {
				ans=arr[i];
			}
			
		}
		return ans;
		
	}
	public static void freqOfVowels(String str) {

		int a=0, e=0, i=0, o=0, u=0;
		str = str.toLowerCase();
		for(int j=0; j<str.length(); j++) {
			  switch(str.charAt(j)) {
	            case 'a': a++; break;
	            case 'e': e++; break;
	            case 'i': i++; break;
	            case 'o': o++; break;
	            case 'u': u++; break;
	        }
		}
		   System.out.print("a=" + a);
		    System.out.print(" e=" + e);
		    System.out.print(" i=" + i);
		    System.out.print(" o=" + o);
		    System.out.print(" u=" + u);
		
	}

}
