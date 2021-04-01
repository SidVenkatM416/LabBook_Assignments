package lab_09;

import java.util.Scanner;

public class LambdaExercise3 {

	public static void main(String[] args) {
		
		final String PASS = "Blabla";
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = s.next();
		
		System.out.println("Enter your password: ");
		String password = s.next();
		
		ValidateUserLogin correctLogin = (login, pass) -> { 
			boolean valid = false;
			if(pass.equals(PASS)) {
				valid = true;
			}
			return valid;
		};
		
		if(correctLogin.validate(name, password)) {
			
			System.out.println("You have entered the correct password");
			
		}else {
			
			System.out.println("You have entered the wrong password");
			
		}
		
		s.close();

	}

}
