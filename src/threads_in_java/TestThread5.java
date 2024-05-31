package threads_in_java;

public class TestThread5 {
	
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
	}

}
