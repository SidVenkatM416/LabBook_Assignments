package Lab_05;

import java.util.Scanner;

public class Exp01 extends Exception {
		 
		private static final long serialVersionUID = 1L;

		public Exp01(String s) {
		  System.out.println(s);
		 }

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.print("Enter ur age : ");
			int age = s.nextInt();
		  
			try {
				if(age < 18) {
					throw new Exp01("Invalid age");
				} else {
		    System.out.println("Valid age");
				}
			}
			catch (Exp01 a) {
				System.out.println(a);
		  }
			s.close();

	}

}
