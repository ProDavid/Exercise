package com.david.code.thread;

public class WaitTimeOutTest {
	public static void main(String[] args) {
		ThreadB t1 = new ThreadB("t1");
		
		synchronized (t1) {
			try {
				System.out.println(Thread.currentThread().getName() + " start...");
				t1.start();
				
				System.out.println(Thread.currentThread().getName() + " call wait...");
				t1.wait(3000);
				
				System.out.println(Thread.currentThread().getName() + " continue...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
