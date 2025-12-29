package Day4;

public class BankAccount {

	public static void main(String[] args) {
		BankAccountClass acc = new BankAccountClass("Sujata", 1000.0);
		acc.deposit(500);
		acc.withdraw(300);
		System.out.println(acc.getBalance());
	}

}

class BankAccountClass{
	private String owner;
	private double balance;
	
	BankAccountClass(String owner, double balance){
		this.owner=owner;
		this.balance=balance;
	}
	
	double deposit(double amount) {
           balance=balance+amount;
           return balance;
	}
	double withdraw(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
		}else {
			System.out.println("Insufficient Money");
		}
		return balance;
		
	}
	String getOwner() {
		return owner;
	}
	double getBalance() {
		return balance;
	}
	protected void applyFee(double fee) {
		
	}
}