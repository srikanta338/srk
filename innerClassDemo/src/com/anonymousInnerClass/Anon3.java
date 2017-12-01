package com.anonymousInnerClass;
//annonymous inner class that implements interface....
public class Anon3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("child thread : "+ i);
				}
				// TODO Auto-generated method stub
				
			}
		};
		Thread t=new Thread(r);
		t.start();
		System.out.println("main thread..");
    }

}
/*
 * 
 * Class Mythread implements Runable{
 * public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("child thread : "+ i);
				}
				}
	class DemoThread{
	public void static void main(String args[]	){
	Mythread m=new MyThread();
	Thread t=new Thread(m);
	
	t.start();
	System.out.println("main thread );
			
 * 
 * 
 * */
