package com.javaStudy;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCDE";
		str.substring(3);
		str.concat("XYZ");
		System.out.println(str);
		
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a,b);
		System.out.println(a+" "+b);
	}
	static void operate(StringBuffer x,StringBuffer y) {
		x.append(y);
		y = x;
	}

}
