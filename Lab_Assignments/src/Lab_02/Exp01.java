package Lab_02;

import java.util.Arrays;
import java.util.Scanner;

public class Exp01 {
	
	public void getSecondSmallest(int arr[]) 
	
	{
		Arrays.sort(arr);
		System.out.println("The Second Smallest number in the array is : "+arr[1]);
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter length of array: ");
		int n=scan.nextInt();
		
		int arr1[]=new int[n];
		
		System.out.println("Enter the items for the array");
		
		for(int i=0;i<n;i++){
			
			arr1[i]=scan.nextInt();
		}
		
		Exp01 obj=new Exp01();
		
		obj.getSecondSmallest(arr1);
		scan.close();

	}

}
