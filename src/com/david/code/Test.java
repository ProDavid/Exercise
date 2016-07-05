package com.david.code;

public class Test {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
//		MyThreadRunable runable = new MyThreadRunable();
//		
//		Thread t1 = new Thread(runable);
//		Thread t2 = new Thread(runable);
//		Thread t3 = new Thread(runable);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
