package com.david.code;

public class Test {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		MyThread t3 = new MyThread("t3");
		
//		MyThreadRunable runable = new MyThreadRunable();
////		
//		Thread t1 = new Thread(runable, "t1");
//		Thread t2 = new Thread(runable, "t2");
//		Thread t3 = new Thread(runable, "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
