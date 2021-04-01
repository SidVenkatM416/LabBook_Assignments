package lab_08;

import java.util.Date;

public class RefreshThread implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("[" + new Date() + "] :Task: Task has been refreshed!");
		try {
			
			Thread.sleep(10000);            //Refreshes after 10 seconds
			
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
			
		}  
		
	}

}
