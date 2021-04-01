package lab_08;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyThread extends Thread{

	public void run() {
		
		try {
			
			int flag = 0;
			FileReader fr=new FileReader("G:\\CapG\\SourceFile.txt");
			FileWriter fw =new FileWriter("G:\\CapG\\DestinationFile.txt");
			
			int pointer = 0;
			while((pointer = fr.read()) != -1) {
				
				fw.write((char)pointer);
				fw.flush();               //Writes content and empties buffer
				flag++;
				if(flag == 10) {
					
					System.out.println("10 characters have been copied");
					flag = 0;
					Thread.sleep(5000);    //Delay of 5 seconds
				}
			}
			
			fw.close();
			fr.close();
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
}
