package com.david.code.thread;

public class WaitTest {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA("t1");
		
		synchronized (t1) {
			try {
				//主线程“main”开始运行，并创建子线程“t1”
				System.out.println(Thread.currentThread().getName() + " statr();");
				t1.start();
				
				//子线程“t1”调用wait，让当前正在运行的线程等待，同时t1获得同步锁开始运行
				//而子线程“t1”运行过程中，调用notify()方法，释放自身同步锁，让当前等待中的主线程“main”重新获得运行机会
				System.out.println(Thread.currentThread().getName() + " wait();");
				t1.wait();
				
				//主线程得意运行
				System.out.println(Thread.currentThread().getName() + " continue");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
