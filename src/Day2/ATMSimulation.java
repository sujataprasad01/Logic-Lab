package Day2;

import java.util.Scanner;

public class ATMSimulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int balance=1000;
		do {
		System.out.println("Choose an option : ");
		
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		
		System.out.println("Enter your choice : ");
		choice=sc.nextInt();

		
		switch(choice) {
		case 1:
			System.out.println("Balance : "+balance);
			break;
		
	    case 2:
		System.out.println("Enter amount : ");
		int amount=sc.nextInt();
		balance=balance+amount;
		System.out.println("New Balance : "+balance);
		break;
	
        case 3:
	    System.out.println("Enter amount to withdraw : ");
	    int withdraw=sc.nextInt();
	    if(balance>=withdraw) {
	    	balance=balance-withdraw;
		    System.out.println("New Balance : "+balance);
	    }else {
		System.out.println("Failed : Insufficient Money");
	    }
	    break;
        case 4:
            System.out.println("Thank you for using ATM");
            break;

        default:
            System.out.println("Invalid Choice!");
        } 
		}while(choice!=4);
	}

}
