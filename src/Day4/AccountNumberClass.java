package Day4;

public class AccountNumberClass {

	public static void main(String[] args) {
		AccountNumber a=new AccountNumber("123456789012");
		AccountNumber b=new AccountNumber("ABC");
		
        System.out.println("A: " + a.getDigits());
        System.out.println("B: " + b.getDigits());
	}

}
class AccountNumber{
	private final String digits;
	
	public static boolean isValid(String s) {
		if(s.length()!=12) {
			return false;
		}
		
		for(int i=0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public AccountNumber(String s) {
		if(isValid(s)) {
			this.digits=s;
		}else {
			 System.out.println("Invalid account number");
	            this.digits = "000000000000";
		}
	}
	public String getDigits() {
		return digits;
	}
}
