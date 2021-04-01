package Lab_01;

import java.util.Scanner;

public class Exp04 {

	public static void main(String[] args) {
		
		int num;
		int count;
		
		Scanner scan=new Scanner(System.in);
	   
		System.out.println("enter the number: ");
		
		num=scan.nextInt();
		
		for(int i=2;i<=num;i++) {
			count=0;
		    	for(int j=2;j<i;j++){
		    		if(i%j==0)
		            count=count+1;
		    	}
		 if(count==0) {
			 System.out.println(i); 
		 }
		
	    }
		scan.close();
	}

}
