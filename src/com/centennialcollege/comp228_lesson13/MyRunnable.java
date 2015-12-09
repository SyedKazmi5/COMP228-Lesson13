package com.centennialcollege.comp228_lesson13;

public class MyRunnable implements Runnable {
	private String _name;

	public MyRunnable(String name) {
		// TODO Auto-generated constructor stub
		this._name = name;

	}

	@Override
	public void run() {

		// Task
		Task1();
	}

	private synchronized void Task1() {
		for (int index = 0; index < 10; index++) {
			System.out.println("Runnable " + this._name + " count: " + index);
			try {
				Thread.sleep(1000); // wait for 1000 ms =1 second
			} catch (InterruptedException exception) {
				// TODO Auto-generated catch block
				System.err.println("Runnable Interrupted" + exception);
			}
		}
	}

}
