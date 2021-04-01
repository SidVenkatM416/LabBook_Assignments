package Lab_01;

import java.util.Scanner;

public class Exp07 {

	public static boolean incNumber(int num) {
		
		int curr = 0;
	    boolean isTrue = false;
	    
	       while(num>0){  
			if(curr <= num % 10){
	               isTrue = true;
	               break;
	           }
	           curr = num % 10;
	           num = num/10;
	       }
		return isTrue;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number : ");
	    int number = scan.nextInt();
	    System.out.print(incNumber(number));
	    if(incNumber(number)) {
	    	System.out.println("increasing number");
	    }else {
	    	System.out.println("not an increasing number");
	    }
	    scan.close();
	}

}
