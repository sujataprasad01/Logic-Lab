package Day3;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter password: ");
	        String password = sc.nextLine();

	        if(validate(password, username)) {
	        	System.out.println("Password is VALID");
	        }
	        else {
	        	System.out.println("Password is INVALID");
	        	 System.out.println("Feedback:");
	             System.out.println(feedback(password, username));
	        }
	}

	public static boolean validate(String pass, String user) {
		
		boolean result=false;
		
		if(pass.length() < 8 || pass.length() > 20)
			return false;
		
		if(pass.contains(" "))
			return false;
		
		if(pass.toLowerCase().contains(user.toLowerCase()))
			return false;
		
		boolean upper=false, lower=false, digit=false, special=false;
        String specials = "!@#$%^&*";
        
			for(int i=0; i<pass.length(); i++) {
				if(Character.isDigit(pass.charAt(i))) {
					digit=true;
				}else if(Character.isLowerCase(pass.charAt(i))) {
					lower=true;
				}else if(Character.isUpperCase(pass.charAt(i))) {
					upper=true;
				}else if(specials.indexOf(pass.charAt(i))!=-1) {
					special=true;
				}else {
					System.out.println("Password should have At least one uppercase, lowercase, digit and special character");
				}
			}
		
		return upper && lower && digit && special;
	}
	
	public static String feedback(String pass, String user) {
		
		String msg="";
		
	    if(pass.length() < 8)
            msg += "- Password too short (min 8 characters)\n";
        if(pass.length() > 20)
            msg += "- Password too long (max 20 characters)\n";
        if(pass.contains(" "))
            msg += "- Password must not contain spaces\n";
        if(pass.toLowerCase().contains(user.toLowerCase()))
        	msg+="- Avoid using parts of your name";
        
        boolean upper=false, lower=false, digit=false, special=false;
        String specials="!@#$%^&*";

        for(int i=0;i<pass.length();i++) {
            char ch = pass.charAt(i);

            if(Character.isUpperCase(ch)) upper=true;
            else if(Character.isLowerCase(ch)) lower=true;
            else if(Character.isDigit(ch)) digit=true;
            else if(specials.indexOf(ch)!=-1) special=true;
            else continue;
        }

        if(!upper) msg += "- Add at least one uppercase letter\n";
        if(!lower) msg += "- Add at least one lowercase letter\n";
        if(!digit) msg += "- Add at least one digit\n";
        if(!special) msg += "- Add more special characters\n";

        return msg;
	}
	
}
