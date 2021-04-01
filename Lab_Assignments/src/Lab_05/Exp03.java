package Lab_05;

import java.util.Scanner;

public class Exp03 extends Exception{
	
	private String salary;
	public Exp03(String salary) {
		this.salary=salary;
	}
	
	public String toString()
	{
		return salary;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Salary:");
		 Double salary=scan.nextDouble();
		try {
			if(salary<3000) 
			{
				System.out.println("Salary="+salary);
				throw new Exp03("Invalid salary");
			}
			else
				System.out.println("Salary="+salary);
				System.out.println("valid Salary");
		}
		catch(Exp03 a) {
			System.out.println(a);
		}
		scan.close();
	}

}
