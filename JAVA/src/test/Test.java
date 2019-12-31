package test;

public class Test implements Runnable{

	public void run() {
		System.out.println("My Thread Is :" + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		Thread testthread = new Thread(new Test());
		testthread.start();
		System.out.println("Main Test Classs");
	}
	
	
}

