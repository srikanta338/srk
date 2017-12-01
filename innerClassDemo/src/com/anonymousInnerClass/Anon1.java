package com.anonymousInnerClass;
//anonymous inner class that extends class
class Popcons{
	public void taste() {
		System.out.println("salty...");
	}
}

public class Anon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popcons p=new Popcons() 
		{                       //here we declaring a class that extends Popcons without
			                   //name...
		  public void taste() //for that child class we are crating an object with parent refernce.
		   {
			System.out.println("spicy....");
		   }
		};
		p.taste();//instant of use 
		
		Popcons p1=new Popcons();//here we created Popcons class object...
		p1.taste();
		
		Popcons p2=new Popcons() {
			
			public void taste() {
				System.out.println("sweet...");
			}
			
		};
		p2.taste();//instant of use..
		
		System.out.println(p.getClass().getName());//1st anonymous class
		System.out.println(p1.getClass().getName());//popcons class...
		System.out.println(p2.getClass().getName());//2nd anonymous class

	}

}
