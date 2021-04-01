package Lab_09;

import java.util.Scanner;

public class LambdaExercise1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = s.nextInt();
		
		System.out.println("Enter the exponent value: ");
		int exponent = s.nextInt();
		
		Power result = (x, y) -> { return (int) Math.pow(x, y); };
		
		System.out.println("Result is "+ result.exponent(number, exponent));
		s.close();

	}

}
