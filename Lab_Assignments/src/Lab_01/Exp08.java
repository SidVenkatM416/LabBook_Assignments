package Lab_01;

import java.util.Scanner;

public class Exp08 {
	
	public static boolean checkNumber(int n) {
		if (n == 0) {
			return false;	
		}
            
        while (n != 1){
            if (n % 2 != 0) {
            	return false;
            }   
            n = n / 2;
        }
        return true;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		scan.close();
		
		System.out.println(checkNumber(n));
		
		if(checkNumber(n)) {
			System.out.println("power of 2");
		}else {
			System.out.println("not a power of 2");
		}
	}

}
