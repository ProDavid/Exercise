package com.david.code;

public class MyThreadRunable implements Runnable {
	private int tickets = 10;
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++){
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName() + "ÂôÆ±ticket£º" + tickets--);
			}
		}
	}
}
