package Lab_01;

import java.util.Scanner;

public class Exp02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a colour [red/green/yellow ] :");
		String light= scan.nextLine();
		
		switch (light) {
			case "red":
				System.out.println("stop");
				break;
			case "green":
				System.out.println("go");
				break;
			case "yellow":
				System.out.println("wait");
				break;
		}
		scan.close();

	}

}
