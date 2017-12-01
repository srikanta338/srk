package com.normalInnerclass;

//accessing inner class code from outside of outer class..
class Test{
	class Best{
		public void m1() {
			System.out.println("wel come to india...");
		}
	}
}
public class Outer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test.Best b=t.new Best();
		b.m1();

	}

}
