package com.anonymousInnerClass;
//Anonymous inner class that defined inside arguments
public class Anon4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable(){
			
		
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++) {
					System.out.println("child thrread :"+ i);
				}
				
			}
		}).start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("main  thrread :"+ i);
		}
	}

}
