package com.sam;

public class siva extends slokamThread {

	public void run() {
		System.out.println("siva run method");
	}
	
	public static void main(String[] args) {
		
		slokamThread s = new slokamThread();
		s.run();
	}
}
