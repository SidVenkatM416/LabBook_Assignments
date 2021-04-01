package Lab_03;

import java.util.Scanner;

public class Exp02 {
	
	public static String getImage(String a) {
		
		StringBuffer sb=new StringBuffer(a);
		sb.reverse();
		String str = sb.toString();
		return str;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the word");
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=a;
		
		System.out.println(b+"|"+getImage(a));
		scan.close();

	}

}
