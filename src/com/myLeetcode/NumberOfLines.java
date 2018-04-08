package com.myLeetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 806. 写字符串需要的行数
我们要把给定的字符串 S 从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，
那么我们应该把这个字母写到下一行。我们给定了一个数组 widths ，这个数组 widths[0] 代表 'a' 需要的单位
， widths[1] 代表 'b' 需要的单位，...， widths[25] 代表 'z' 需要的单位
*/

public class NumberOfLines {

	public static void main(String[] args) {
		NumberOfLines nl = new NumberOfLines();
//		int[] widths= {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
//		String S = "abcdefghijklmnopqrstuvwxyz";
		int[] widths= {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "bbbcccdddaaa";
		int[] out = nl.numberOfLines(widths, S);
		System.out.println(Arrays.toString(out));
	}
	
	public int[] numberOfLines(int[] widths, String S) {
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		char str = 'a';
		for (int i = 0;i <widths.length;i++) {
			
			m.put(str++, widths[i]);
		}
		int sum =0;
		int count = 1;
		for (int i = 0;i <S.length();i++) {
			char str_temp  = S.charAt(i); 
			sum += m.get(str_temp);
			
			if(sum>100) {
				//sum = sum - m.get(str_temp);
				sum = 0;
				count++ ;
				sum += m.get(str_temp);
			} 
		}
       int out[] = new int[2];
		out[0] = count;
		out[1] = sum;
		
		return  out;
	}

}
