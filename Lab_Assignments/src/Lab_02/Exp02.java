package Lab_02;

import java.util.Arrays;
import java.util.Scanner;

public class Exp02 {
	
	static String[] sortStrings(String[] str) {
		 
		Arrays.sort(str);
		int len = str.length%2==0 ? str.length/2 : str.length/2+1;
		for(int i=0;i<len;i++) {
			str[i]=str[i].toUpperCase();
		}
		return str;
	}

	public static void main(String[] args) {
		
		int count;
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of strings : ");
        
        count = scan.nextInt();
        
        String str[] = new String[count];
        
        Scanner s1 = new Scanner(System.in);
         System.out.println("Enter the Strings one by one:");
         
        for(int i = 0; i < count; i++)
        {
            str[i] = s1.next();
        }
        
        for(String g:sortStrings(str))
        	System.out.println(g);
        scan.close();
        s1.close();

	}

}
