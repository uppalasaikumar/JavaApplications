package com.sai.programs;

public class DeadLock {

	static Integer i1 = new Integer(10);
	static Integer i2 = new Integer(20);
	
	public static void main(String[] args) {
		
		Thread1 t1  = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

}

class Thread1 extends Thread{
	
	public void run() {
		synchronized (DeadLock.i1) {
			System.out.println("holding i1");
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("waiting for i2");
			
			synchronized (DeadLock.i2) {
				System.out.println("Thread1 : holding i1 and i2");
			}
		}
	}
}


class Thread2 extends Thread{
	
	public void run() {
		synchronized (DeadLock.i2){
			System.out.println("holding i2");
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("waiting for i1");
			
			synchronized (DeadLock.i1) {
				System.out.println(" Thread 2: holding i1 and i2");
			}
		}
	}
}
