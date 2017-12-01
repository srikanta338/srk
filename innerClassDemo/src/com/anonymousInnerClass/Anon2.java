package com.anonymousInnerClass;
//threading demo annonymous inner class extends thread class
public class Anon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread() 
		{
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("child thread..");
				}
			}
			
		};
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main..thread..");
		}
		

	}

}
/* class Mythread extends Thread{
 * public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("child thread..");
				}
			}
			}
			class Anon2{
			public static void main(String[] args) {
			Mythread t=new MyThread();
			t.start();
			for(int i=0;i<5;i++) {
			System.out.println("main..thread..");
		}
			
			
			}
			}
			
 * 
 * */
