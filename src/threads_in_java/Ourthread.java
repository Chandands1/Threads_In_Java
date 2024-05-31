package threads_in_java;

public class Ourthread extends Thread{
	public void run() {
		for (int i =1; i<=5;i++) {
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

}
