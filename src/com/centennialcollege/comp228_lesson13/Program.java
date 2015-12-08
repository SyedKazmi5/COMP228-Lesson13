package com.centennialcollege.comp228_lesson13;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread thread1 = new MyThread("1");
		//MyThread thread2 = new MyThread("2");
		
		MyRunnable myRunable1 = new MyRunnable("1");
		MyRunnable myRunable2 = new MyRunnable("2");
		
		ExecutorService executor = Executors.newFixedThreadPool(3); 

		executor.execute(myRunable1);
		executor.execute(myRunable2);
		
		
		//Thread thread1  = new Thread(myRunable1);
		//Thread thread2  = new Thread(myRunable2);
		
		//thread1.start(); //start secondary thread1
		//thread2.start(); //start secondary thread1
		
		//start main operation
		for(int index=0; index<10; index++){
			System.out.println("Main Count: " + index);	
			try {
				Thread.sleep(1000); //wait for 1000 ms =1 second
				if  (index>5){
					//thread1.interrupt();
				}
			} catch (InterruptedException exception) {
				// TODO Auto-generated catch block
				System.err.println("Thread Interrupted" + exception);
			}
		}

	}

}
