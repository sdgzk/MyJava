package com.myLeetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 806. д�ַ�����Ҫ������
����Ҫ�Ѹ������ַ��� S ������д��ÿһ���ϣ�ÿһ�е������Ϊ100����λ�����������дĳ����ĸ��ʱ���ʹ���г�����100 ����λ��
��ô����Ӧ�ð������ĸд����һ�С����Ǹ�����һ������ widths ��������� widths[0] ���� 'a' ��Ҫ�ĵ�λ
�� widths[1] ���� 'b' ��Ҫ�ĵ�λ��...�� widths[25] ���� 'z' ��Ҫ�ĵ�λ
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
