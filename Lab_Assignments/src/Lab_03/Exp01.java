package Lab_03;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exp01 {

	public static void main(String[] args) {
		
		int n,sum=0;
		Scanner sc=new Scanner(System.in);		
		String str=sc.nextLine();

		StringTokenizer strt=new StringTokenizer(str," ");
		
		while(strt.hasMoreElements())
		{
			String next=strt.nextToken();
			n=Integer.parseInt(next);
			sum+=n;
		}
		System.out.println("Sum: "+sum);
		sc.close();

	}

}
