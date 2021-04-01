package lab_09;

import java.util.Scanner;

public class LambdaExercise2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String string = s.next();
		
		AddSpace result = (answer) -> { StringBuilder space = new StringBuilder();
			char[] array = answer.toCharArray();
			for(char ch :array) {
				space.append(ch);
				space.append(" ");
			}
			space.deleteCharAt(space.length() - 1);
			return space.toString();
		};
		System.out.println("Result is "+ result.addSpace(string));
		
		s.close();

	}

}
