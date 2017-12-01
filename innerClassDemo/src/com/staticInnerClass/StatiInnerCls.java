package com.staticInnerClass;

public class StatiInnerCls {
	static class Inner{
		public void show() {
			System.out.println(" i am static inner class demo...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i=new Inner();
		i.show();

	}

}
