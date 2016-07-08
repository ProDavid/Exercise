package com.david.code;

/**
* @author David
* @modifyDate 2016年7月5日
* @description 通过实现Runnable接口，实现多线程
*/
public class MyThreadRunable implements Runnable {
//	private int tickets = 10;
	
	@Override
	public void run() {
//		for(int i = 0; i < 20; i++){
//			if(tickets > 0){
//				System.out.println(Thread.currentThread().getName() + "卖票ticket：" + tickets--);
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
