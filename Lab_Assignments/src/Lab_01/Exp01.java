package Lab_01;

import java.util.Scanner;

public class Exp01 {
	
	int i;
	int sum=0;
	public int cubes(int num){
		
	for(int i=1;i<=num;i++){
	
		sum=sum+(i*i*i);
	}
	System.out.println(sum);
	
	return num;
	}
	
	public static void main(String[] args) {
		
		int num;
		Exp01 s=new Exp01();
		System.out.println("enter a number : ");
		Scanner scan=new Scanner(System.in);
		num =scan.nextInt();
		s.cubes(num);
		scan.close();
	}

}
