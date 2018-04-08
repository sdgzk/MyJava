package com.myLeetcode;

public class HanmingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HanmingDistanceL hh= new HanmingDistanceL();
//		int x = 1,y= 4;
		int x = 3,y= 1;
		int d = hh.hammingDistance(x, y);
		System.out.println(d);
		
		HanmingDistanceM hm= new HanmingDistanceM();
		 x = 1;
		 y= 4;
		 d = hm.hammingDistance(x, y);
		System.out.println(d);
	}

}
class HanmingDistanceL {
	public int hammingDistance(int x, int y) {
		String b = Integer.toBinaryString( x^y);
		int j = 0;
		for (int i =0;i <b.length();i++) {
			char a = b.charAt(i);
			if (a == '1') j++;
		}
		return j;
	}
}
class HanmingDistanceM {
	public int hammingDistance(int x, int y) {
		int e = x^y;
		int r = 0;
	    while(e != 0){
	        if((e&1) == 1)
	            ++r;
	        e>>=1;
	    }
	    return r;
	}
}