package Day1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
	
		  System.out.print("Enter a string : ");
		  String st=sc.nextLine();
		  
		  StringBuilder sb=new StringBuilder(st);
		  String reverse=sb.reverse().toString();
		  
		  System.out.println(reverse);
	    }

}
