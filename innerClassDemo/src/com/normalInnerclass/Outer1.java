package com.normalInnerclass;
//accessing inner class code from instance area of outer class..
public class Outer1 {
	class Inner1{
		public void m1() {
			System.out.println("hi gaura...");
		}
	}
	
	public void m2() {
		Inner1 i=new Inner1();
		i.m1();
		System.out.println("hi dude..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 o=new Outer1();
		o.m2();

	}

}
