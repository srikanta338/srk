package com.normalInnerclass;
//accessing inner class code from static area of outer class...
//applicable modifier for outer class are
//public, final, default,strictfp, abstract....
public class Outer {
	
	//applicable modifier of inner class are outer class modifier + private, protected, static
	class Inner{
		public void m1() {
			System.out.println("wel come to inner class..");
		}
		//inner class not have static modifier and main method...
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Outer o=new Outer();
		//Outer.Inner i=o.new Inner();
		//i.m1();
		//................
		Outer.Inner i= new Outer().new Inner();
		i.m1();

	}

}
