package com.david.code.thread;

public class ThreadB extends Thread {
	public ThreadB(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running...");
		
		//死循环
		while(true);
	}
}
