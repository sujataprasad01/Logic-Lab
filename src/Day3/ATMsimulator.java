package Day3;

import java.util.Scanner;

public class ATMsimulator {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        double balance = 0;   
	        int pin = 1234;            
	        int choice;

	        System.out.println("Welcome to NGP Bank");

	        while(true) {

	            System.out.println("\n1) Deposit");
	            System.out.println("2) Withdraw");
	            System.out.println("3) Check Balance");
	            System.out.println("4) Change PIN");
	            System.out.println("5) Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch(choice) {
	            case 1:
	            	   balance =deposit(balance);
	            break;
	            case 2:
	            	   balance =withdraw(balance, pin);
	    		break;
	            case 3:printBalance(balance) ;
	    		break;
	            case 4:
	    		pin=changePin(pin);
                break;
	            default:
	            System.out.println("Existing...");
	            System.exit(0);
	            }
	            }
	        
	}
	public static double deposit(double balance) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Amount to deposit : ");
		 int amount = sc.nextInt();
		 if(amount>0) {
			 System.out.println("Deposited");
			 balance=balance+amount;
			 System.out.println("Balance : " + balance);
		 }else {
			 System.out.println("Invalid Numbers");
		 }
		 return balance;
	}
	
	public static double withdraw(double balance, int pin) {
			Scanner sc = new Scanner(System.in);
			 System.out.print("Enter Amount to withdraw : ");
			 int amount = sc.nextInt();
			 System.out.print("Enter your pin : ");
			 int newPin = sc.nextInt();
			 if(balance>0 && newPin==pin) {
				 System.out.println("Balance updated");
				 balance=balance-amount;
				 System.out.println("New Balance : " + balance);
			 }
			 else if(newPin!=pin){
				 System.out.println("Wrong Pin");
			 }
			 else {
				 System.out.println("Insufficient Money");
			 }
			 return balance;
	}
	
	public static int changePin(int pin) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("For changing pin first enter your old pin : ");
		 int oldPin = sc.nextInt();
		 if(oldPin==pin){
			 System.out.print("Enter new Pin : ");
			 int newPin = sc.nextInt();
			 pin=newPin;
			 System.out.print("Pin updated sucessfully : ");
		 }else {
			 System.out.println("Wrong Pin");
		 }
		 return pin;
	}
	
	public static void printBalance(double balance) {
		 System.out.println("Balance : " + balance);
	}

}
