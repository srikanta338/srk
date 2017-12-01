package com.normalInnerclass;
//we can access both static and non static member of outer class directly...
public class Outer4 {
	int x=10;
	static int y=20;
	class Inner4{
		int x=100;
		public void demo() {
			int x=1000;
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(this.x);//this use for current class object
			System.out.println(Outer4.this.x);//here we use outer member through this way.
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer4().new Inner4().demo();

	}

}
