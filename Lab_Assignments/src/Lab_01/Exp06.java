package Lab_01;

import java.util.Scanner;

public class Exp06 {
	
	public static int calcDif(int n){
	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
	      
	      int sumN = (n * (n + 1)) / 2;
	      
	      int squareSumN = sumN * sumN;
	      
	      return Math.abs(sumSquareN - squareSumN);
	   }

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number  : ");
		
		int n = scan.nextInt();
		
		System.out.println("Number: " + n);
		
		System.out.println("Difference: " + calcDif(n));
		scan.close();

	}

}
