package com.myLeetcode;

//��ʹ������� + ��-������������a ��b֮�͡�
//
//ʾ����
//�� a = 1 ��b = 2������ 3��
public class TwoIntAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoIntAdd t = new TwoIntAdd();
		int a = 2;
		int b = 2;
		int sum =t.getSum(a, b);
		System.out.println(sum);
	}


	public int getSum(int a, int b) {
		System.out.println(Integer.toBinaryString(a)); 
		                                                  
		System.out.println(Integer.toBinaryString(b));
		while(a != 0) {
			int tmp = (a & b) << 1;
			b = a ^ b;
			a = tmp;
		}
		return b;

		
		
	}	
}
