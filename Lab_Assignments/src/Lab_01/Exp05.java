package Lab_01;

import java.util.Scanner;

public class Exp05 {

	static int calcSum(int n){
		
		int sum=0,i=0,j=0;
		
		for(i=0;;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
				j++;
			if(j==n+1)
				break;
			}			
	}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number  : ");
		
		int n = scan.nextInt();	
		
		System.out.println(calcSum(n));
		
		scan.close();

	}

}


