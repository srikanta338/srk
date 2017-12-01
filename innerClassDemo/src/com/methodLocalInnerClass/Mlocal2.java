package com.methodLocalInnerClass;

public class Mlocal2 {
	int x=10;//instance variable..
	static int y=20;//static variable..
	public void m() { //if it will static, then it will show compile error because of line-1
		int j=10;
		
		class Inner{
			public void show() {
				System.out.println(x);//line-1, 
				System.out.println(y);
				System.out.println(j);
			}
		}
		Inner i=new Inner();
		i.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mlocal2 t=new Mlocal2();
		t.m();

	}

}
