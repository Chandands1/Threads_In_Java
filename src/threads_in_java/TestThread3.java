package threads_in_java;

public class TestThread3 {
	public static void main(String[] args) {
		Runnable myRunnable = () -> System.out.println("The Thread is running");
		
		Thread t1 = new Thread(myRunnable);
		t1.start();
	}

}
