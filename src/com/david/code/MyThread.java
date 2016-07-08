package com.david.code;

/**
 * @author David
 * @modifyDate 2016年7月5日
 * @description 通过继承Thread类实现的多线程
 */
public class MyThread extends Thread {
//	private int tickets = 10;
	
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
//		for(int i = 0; i < 20; i++){
//			if(tickets > 0){
//				System.out.println(this.getName() + "��Ʊticket��" + tickets--);
//			}
//		}
		synchronized(this){
			try {
				for(int i = 0; i < 5; i++){
					Thread.sleep(100);
					
					System.out.println(Thread.currentThread().getName() + "loop:" + i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
