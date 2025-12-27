package Day3;

import java.util.Scanner;

public class MatrixOperations {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of rows (2-10): ");
		        int r = sc.nextInt();
		        System.out.print("Enter number of columns (2-10): ");
		        int c = sc.nextInt();

		        int[][] A = new int[r][c];
		        int[][] B = new int[r][c];

		        System.out.println("\nEnter Matrix A:");
		        for(int i=0; i<A.length; i++) {
		        	for(int j=0; j<A[0].length; j++) {
		        		A[i][j]=sc.nextInt();
		        	}
		        }

		        System.out.println("Enter Matrix B:");
		        for(int i=0; i<B.length; i++) {
		        	for(int j=0; j<B[0].length; j++) {
		        		B[i][j]=sc.nextInt();
		        	}
		        }


		        while(true) {
		            System.out.println("\n MATRIX MENU ");
		            System.out.println("1) Add");
		            System.out.println("2) Subtract");
		            System.out.println("3) Multiply");
		            System.out.println("4) Transpose (Matrix A)");
		            System.out.println("5) Row/Column Sums");
		            System.out.println("6) Exit");
		            System.out.print("Enter choice: ");
		            int ch = sc.nextInt();
		            
		            switch(ch) {
	                case 1:
	                    add(A,B);
	                    break;
	                case 2:
	                    subtract(A,B);
	                    break;
	                case 3:
	                    multiply(A,B);
	                    break;
	                case 4:
	                    transpose(A);
	                    break;
	                case 5:
	                    rowColSum(A);
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid Choice!");
	            }
		        }

	}
		    
		    public static void add(int[][] A, int[][] B) {
				for(int i=0; i<A.length; i++) {
					for(int j=0; j<A[0].length; j++) {
						System.out.print((A[i][j]+B[i][j])+ " ");
					}
					System.out.println();
				}
			}
		    
		    public static void subtract(int[][] A, int[][] B) {
		    	for(int i=0; i<A.length; i++) {
					for(int j=0; j<A[0].length; j++) {
						System.out.print((A[i][j]-B[i][j])+ " ");
					}
					System.out.println();
				}
					}
		    
		    public static void multiply(int[][] A, int[][] B) {
						int r=A.length;
						int c=A[0].length;
						int[][] result=new int[r][c];
						
						for(int i=0; i<r; i++) {
							for(int j=0; j<c; j++) {
								for(int k=0; k<c; k++) {
									result[i][j]=result[i][j]+ A[i][k] * B[k][j];
								}
							}
							
						}
				    	for(int i=0; i<result.length; i++) {
							for(int j=0; j<result[0].length; j++) {
								System.out.print(result[i][j]+" ");
							}
							System.out.println();
						}
						
					}
		    
		    public static void transpose(int[][] A) {
				for(int i=0; i<A[0].length; i++) {
					for(int j=0; j<A.length; j++) {
						System.out.print(A[i][j] +" ");
					}
					System.out.println();
				}
					}
		    
		    public static void rowColSum(int[][] A) {
		    	System.out.println("Row Sums : ");
		    
				for(int i=0; i<A.length; i++) {
					int sum=0;
					for(int j=0; j<A[0].length; j++) {
						sum=sum+A[i][j];
					}
					System.out.println("Row "+(i+1)+" = "+sum);
				}
				
				System.out.println("Column Sums : ");
			    
				for(int i=0; i<A[0].length; i++) {
					int sum=0;
					for(int j=0; j<A.length; j++) {
						sum=sum+A[j][i];
					}
					System.out.println("Col"+(i+1)+" = "+sum);
				}
					}
}
