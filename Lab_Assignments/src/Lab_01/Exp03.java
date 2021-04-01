package Lab_01;

import java.util.Scanner;

public class Exp03 {
	
	public static int fibRecursive(int n) {
		if (n <= 1)
			return n;
		else
			return fibRecursive(n - 1) + fibRecursive(n - 2);
	}

	public static int fibNonRecursive(int n) {
		int first = 1, second = 1, next;
		
		for(int i = 3;i<=n;i++)	{
		next = first + second;
		first = second;
		second = next;
	}
	return(second);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a Number:");
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Using Recursive Function:"+fibRecursive(n));
		System.out.println("Using Non-Recursive Function:"+fibNonRecursive(n));
		scan.close();
	}

}

