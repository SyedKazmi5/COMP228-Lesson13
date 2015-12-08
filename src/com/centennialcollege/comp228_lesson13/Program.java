package com.centennialcollege.comp228_lesson13;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread1 = new MyThread("1");
		MyThread thread2 = new MyThread("2");
		
		thread1.start(); //start secondary thread1
		
		
		
		
		thread2.start(); //start secondary thread1
		
		//start main operation
		for(int index=0; index<10; index++){
			System.out.println("Main Count: " + index);	
			try {
				Thread.sleep(1000); //wait for 1000 ms =1 second
			} catch (InterruptedException exception) {
				// TODO Auto-generated catch block
				System.err.println("Thread Interrupted" + exception);
			}
		}

	}

}
