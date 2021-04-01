package lab_08;

public class RefreshUI {

	public static void main(String[] args) {
		
		RefreshThread rt = new RefreshThread();
		Thread thread = new Thread(rt);
		thread.start();
		

	}

}
