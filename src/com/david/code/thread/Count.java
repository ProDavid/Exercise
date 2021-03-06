package com.david.code.thread;

public class Count {
	public void syncMethod(){
		synchronized(this){
			try {
				for(int i = 0; i < 5; i++){
					Thread.sleep(100);
					
					System.out.println(Thread.currentThread().getName() + "syncMethod loop:" + i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void nonSyncMethod(){
//		synchronized (this) {
			try {
				for(int i = 0; i < 5; i++){
					Thread.sleep(100);
					
					System.out.println(Thread.currentThread().getName() + "nonSyncMethod loop:" + i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
	}
}
