package com.myLeetcode;
// µßµ¹ÕûÊı
public class DiandaoInt {

	public static void main(String[] args) {

		DiandaoInt dd = new DiandaoInt();
		int r1 = dd.reverse(-2147483648);
		System.out.println("First:"+ r1);
		int r2 = dd.reverse2(-2147483648);
		System.out.println("Second:"+ r2);
	}
	public int reverse(int x) {
		boolean b = false;
		long x1 = x;
		if (x < 0) {
			b = true;
			x1= (long) x *-1;
		} 

		String x_s =String.valueOf(x1);
		StringBuffer sb = new StringBuffer();
		for (int i = x_s.length()-1;i >= 0 ;i--) {
			//System.out.println("ss");
			char c = x_s.charAt(i);

			sb.append(c);


		}
		String ss = sb.toString();
		long ls = Long.valueOf(ss);
		int maxint = Integer.MAX_VALUE;
		if (ls > maxint) {
			return 0;
		}

		int r = Integer.valueOf(sb.toString());

		if (b == true) {
			return r*-1;
		} else {
			return r;
		}

	}
	public int reverse2(int x) {
		boolean negative = x < 0;  
        if (negative) x = -x;  
        long r = 0;  
        while (x>0) {  
            r = r * 10 + x % 10;  
            x /= 10;  
        }  
        if (negative) r = -r;  
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;  
        return (int)r;
	}
}
