package Day3;

import java.util.Scanner;

public class Phonebook {

	 static String[] names = new String[100];
	    static String[] phones = new String[100];
	    static int count = 0;
	    
	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Phonebook CLI Started...");

        while (true) {
            System.out.print(">> ");
            String input = sc.nextLine();

            String[] parts = input.split(" ");

            String command = parts[0].toUpperCase();

            switch (command) {
                case "ADD":
                    add(parts);
                    break;

                case "DEL":
                    delete(parts);
                    break;

                case "FIND":
                    find(parts);
                    break;

                case "LIST":
                    list();
                    break;

                case "EXIT":
                    System.out.println("Exiting Phonebook...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    public static void add(String[] parts) {
    	if(count>=100) {
    		System.out.println("Phonebook Full.");
    		return;
    	}
        names[count]=parts[1];
        if(parts[2].length()<10 || parts[2].length()>10) {
        	phones[count]=parts[2];
        }else {
        	System.out.println("Number should be of 10 digits not less not more");
        }
        count++;
    	System.out.println("Contact added.");
    }

    public static void delete(String[] parts) {
    	for(int i=0; i<count; i++) {
    		if(names[i].equalsIgnoreCase(parts[1])) {
    			for(int j=i; j<count-1; j++) {	
    			names[j]=names[j+1];
    			phones[j]=phones[j+1];
    			}
    			count--;
    			 System.out.println("Contact deleted.");
                 return;
    		}  
    	}
    	System.out.println("Contact not found.");
    }

    public static void find(String[] parts) {
    	boolean found=false;
    	for(int i=0; i<count; i++) {
    		if(names[i].contains(parts[1].toLowerCase())) {	
    			 System.out.println("Found : "+ names[i]+"("+phones[i]+")");
    			 found=true;
    		}
    	}
    	if(!found) System.out.println("No matching contact found.");
    }

    public static void list() {
    	if(count==0) {
    		   System.out.println("No contacts.");
               return;
    	}
     	for(int i=0; i<count; i++) {	
     		 System.out.println(names[i]+"("+phones[i]+")");
    		}
    	}
    }

