package Lab_05;

import java.util.Scanner;

public class Exp02 extends Exception {
	 
	private static final long serialVersionUID = 1L;

	public Exp02(String s) {
	  System.out.println(s);
	 } 

	public static void main(String[] args) {
		
		String firstName =new String();
		String lastName =new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name followed by last name :");
		firstName =sc.nextLine();
		lastName =sc.nextLine();
		sc.close();
		
		try {
			if(firstName.isBlank())
				throw new Exp02("First Name cannot be blank");
			else
				System.out.println("Valid First name");
			
			if(lastName.isBlank())
				throw new Exp02("Last Name cannot be blank");
			else
				System.out.println("Valid Last name");
		}		
		catch(Exp02 e)
		{
			System.out.println(e);
		}
	}

}
