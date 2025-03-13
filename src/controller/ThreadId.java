package controller;

public class ThreadId extends Thread{
	
	public void run() {
		int threadId = (int) getId(); //(int) threadId()
		System.out.println("#"+threadId);
	}

}
