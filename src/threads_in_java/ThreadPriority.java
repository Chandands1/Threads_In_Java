package threads_in_java;

public class ThreadPriority extends Thread{
	public void run() {
		System.out.println("thread is runnig in priority"+ this.getPriority());
	}

}
