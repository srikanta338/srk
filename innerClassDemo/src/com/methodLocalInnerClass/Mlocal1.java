package com.methodLocalInnerClass;

public class Mlocal1 {
	public void m1() {
		//inner class declaration inside the method....
		//we can declare inner class inside instance and static method...
		class Inner{
			public void sum(int x, int y) {
				System.out.println("sum of the numbers are :" + (x+y));
			}
		}
		Inner i= new Inner();
		i.sum(100, 200);
		i.sum(10, 20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mlocal1 m=new Mlocal1();
		m.m1();
		

	}

}
