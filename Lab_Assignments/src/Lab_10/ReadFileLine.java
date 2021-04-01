package lab_10;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileLine {

	public static void main(String[] args) {
		
		int line = 1;
		FileReader reader = null;
		BufferedReader buffer = null;
		
		try {
			
			reader = new FileReader("Test");
			buffer = new BufferedReader(reader);
			String string = null;
						
			while(true) {		
				
				string = buffer.readLine(); 
				
                if (string == null) {
                	
					break;
                }
                if(!(string.isEmpty())) {
                	
                	System.out.println(line +" "+ string);
                	line++;
                }
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} 

	}
}


