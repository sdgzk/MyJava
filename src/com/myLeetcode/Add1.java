package com.myLeetcode;
import java.util.Arrays;

public class Add1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add1 add = new Add1();
		int digits[] = {1,9,8};
		//System.out.println(Arrays.toString(add.plusOne(digits)));
		System.out.println(Arrays.toString(add.plusOne1(digits)));
	}

	public int[] plusOne(int[] digits) {
		//		for (int i = digits.length - 1;i>=0; i--) {
		//			if (digits[i] == 9 && i>=1) {
		//				digits[i] = 0;
		//				digits[i-1]+=1;	  
		//			}
		//		}

		String data = "";
		for (int i = 0;digits != null && i< digits.length;i++) {

			data+=digits[i];
		}
		Integer dateInt = 0;
		if ("".equals(data)== false) 
			dateInt = Integer.parseInt(data);
		dateInt++;
		data = dateInt.toString();
		char[] c = data.toCharArray();
		System.out.println(Arrays.toString(c));
		String ss =  Arrays.toString(c);
		System.out.println("ss1="+ss );
		ss = ss.substring(1, ss.length()-1);
		System.out.println("ss2="+ss );
		String[] bb=  ss.split(",");
		System.out.println("bb="+Arrays.toString(bb));


		// int[] arri = Arrays.ConvertAll(bb, new Converter<String, Integer>(StrToInt));
		return digits;
	}

	public int[] plusOne1(int[] digits) {
		int n = digits.length;
		for (int i = digits.length - 1; i >= 0; --i) {
			if (digits[i] < 9) {
				++digits[i];
				return digits;
			}
			digits[i] = 0;
		}
		int[] res = new int[n + 1];
		res[0] = 1;
		return res;

	}
}
