package Day3;

import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of students : ");
		int noOfStudents=sc.nextInt();
		
		String[] names=new String[noOfStudents];
		int[] grades=new int[noOfStudents];
		
		System.out.print("Enter names of "+noOfStudents+" students and also with grades (0-100) : ");
	
		for(int i=0; i<noOfStudents; i++) {
			names[i]=sc.next();
			grades[i]=sc.nextInt();
		}
		
System.out.println("Menu : ");
		
		System.out.println("1. Print all");
		System.out.println("2. Print topper");
		System.out.println("3. Class average");
		System.out.println("4. Search by name");
		System.out.println("5. Curve grades by +5 (cap at 100)");
		System.out.println("6. Exit");
		
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();

		
		switch(choice) {
		case 1:
			printAll(names, grades);
			break;
		
	    case 2:
		printTopper(names, grades);
		break;
	
        case 3:
	    classAvg(grades);
	    break;
        case 4:
            searchByName(names, grades);
            break;
        case 5:
        	curveGrades(names,grades);
        	break;
        default:
            System.out.println("Exiting...");
	}
	}
	
	public static void printAll(String[] names, int[] grades) {
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + ": " + grades[i]);
		}
	}
public static void printTopper(String[] names, int[] grades) {
	int topper=grades[0];
	String name=names[0];
	for(int i=1; i<names.length; i++) {
		if(grades[i]>topper) {
			topper=grades[i];
			name=names[i];
		}
	}
	System.out.println("Topper : " +name + " having grade " + topper);
	}
public static void classAvg(int[] grades) {
	double avg=0;
	int total=0;
	for(int i=0; i<grades.length; i++) {
		total=total+grades[i];
	}
	avg=double(total)/grades.length;
	System.out.println("Average : "+avg);
}
public static void searchByName(String[] names ,int[] grades) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Search by name : ");
	String name=sc.next();
	boolean found=false;
	for(int i=0; i<names.length; i++) {
		if(name.equalsIgnoreCase(names[i])) {
			name=names[i];
			System.out.println(names[i] +" "+ grades[i]);
			found=true;
			break;
		}
	}
	if(!found)
		System.out.println("Student not found!");
	
}
public static void curveGrades(String[] names,int[] grades) {
	for(int i=0; i<grades.length; i++) {
		if(grades[i]<=95) {
			grades[i]=grades[i]+5;
		}
	}
	for(int i=0; i<grades.length; i++) {
		System.out.print("New Marks : "+ names[i] + grades[i]);
	}
	
}

}
