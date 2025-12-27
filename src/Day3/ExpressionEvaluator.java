package Day3;

import java.util.*;

public class ExpressionEvaluator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a arithmetic expression like - 12 + 3 * 4 - 5 / 2 : ");
		String expression=sc.nextLine();
		
		try {
		int result=evaluate(expression);
		 System.out.println("Result: " + result);
		}catch(Exception e) {
			 System.out.println("Error: " + e.getMessage());
		}
	}
	public static int evaluate(String expression) throws Exception {
		List<String> li=tokenize(expression);
		if(li == null) {
			throw new Exception("Invalid expression!");
		}
		int result=parse(li);
		return result;
	}
	
	public static List<String> tokenize(String expression) throws Exception{
		List<String> tokens=new ArrayList<>();
		int i=0;
		while(i<expression.length()) {
			
			char ch=expression.charAt(i);
			
			if(ch==' ') {
				i++;
				continue;
			}
			
			if(Character.isDigit(ch)) {
				String num="";
				
				while(i<expression.length() && Character.isDigit(expression.charAt(i))) {
					num+=expression.charAt(i);
					i++;
				}
				tokens.add(num);
			}
			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
				tokens.add(ch+"");
				i++;
			}else {
				throw new Exception("Invalid character: "+ch);
			}
		}
		return tokens;
	}
	
	public static int parse(List<String> tokens) throws Exception{
		
		if(tokens.size()%2==0) {
			throw new Exception("Invalid expression structure");
		}
		
//		number-operator pattern
		
		for(int i=0; i<tokens.size(); i++) {
			if(i%2==0 && !tokens.get(i).matches("\\d+")) {
				throw new Exception("Expected number at position " + i);
			}else if(i%2==1 && !tokens.get(i).matches("[+\\-*/]")) {
				throw new Exception("Expected operator at position " + i);
			}
		}
		
//		Handle * and /
		
		for(int i=0; i<tokens.size(); i++) {
			
			String token=tokens.get(i);
			
			if(token.equals("*") || token.equals("/")) {
				
				int left=Integer.parseInt(tokens.get(i-1));
				int right=Integer.parseInt(tokens.get(i+1));
				
				if(token.equals("/") && right==0) {
					  throw new Exception("Division by zero is not allowed");
				}
				int result;
				if(token.equals("*")) {
					result=left*right;
				}else {
					result=left/right;
				}
				
				
				tokens.set(i-1, String.valueOf(result));
				tokens.remove(i);
				tokens.remove(i);
				
				i--;
			}
		}
		
//		Handle + and -
		
		int result=Integer.parseInt(tokens.get(0));
		
		for(int i=1; i<tokens.size(); i+=2) {
			
			String op=tokens.get(i);
			int num=Integer.parseInt(tokens.get(i+1));
			
			if(op.equals("+")) {
				result=result+num;
			}else {
				result=result-num;
			}
		}
		
		return result;
	}

}
