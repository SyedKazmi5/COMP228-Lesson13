package com.centennialcollege.comp228_lesson13;

public class MyThread extends Thread {

	//Private instance variable
	private String _name;

	public MyThread(String name){
		this._name = name;
	}

	@Override
	public void run() {
		
		
		//Task
		for(int index=0; index<10; index++){
			System.out.println("Thread " + this._name + " count: " + index);	
			try {
				sleep(1000); //wait for 1000 ms =1 second
			} catch (InterruptedException exception) {
				// TODO Auto-generated catch block
				System.err.println("Thread Interrupted" + exception);
			}
		}
		// TODO Auto-generated method stub
		super.run();
	}

	
	
	
}
