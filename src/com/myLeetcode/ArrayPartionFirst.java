package com.myLeetcode;
import java.util.Arrays;

//��������Ϊ 2n ������, ��������ǽ���Щ���ֳ� n ��, ���� (a1, b1), (a2, b2), ..., (an, bn) ��ʹ�ô�1 �� n �� min(ai, bi) �ܺ����
//
//ʾ�� 1:
//
//����: [1,4,3,2]
//
//���: 4
//����: n ���� 2, ����ܺ�Ϊ 4 = min(1, 2) + min(3, 4).
//��ʾ:
//
//n ��������,��Χ�� [1, 10000].
//�����е�Ԫ�ط�Χ�� [-10000, 10000].

public class ArrayPartionFirst {
	public static void main(String[] args) {
		ArrayPartionFirst ar = new ArrayPartionFirst();
		int[] nums = {1,4,3,2};
       int sum =  ar.arrayPairSum(nums);
       System.out.println(sum);
	}

	public int arrayPairSum(int[] nums) {
		//System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		//System.out.println(Arrays.toString(nums));
		int sum = 0;
		for (int i = 0;i < nums.length;i= i+2) {
			sum += nums[i];
		}
		return sum;
	}

}
