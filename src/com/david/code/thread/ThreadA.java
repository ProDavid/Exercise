package com.david.code.thread;

public class ThreadA extends Thread {
	public ThreadA(String name) {
		super(name);
	}

	@Override
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " call notify();");

			// 唤醒当前等待线程，释放自身同步锁
			notify();
		}
	}
}
