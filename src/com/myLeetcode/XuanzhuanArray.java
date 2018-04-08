package com.myLeetcode;
import java.util.Arrays;

//
//������ n ��Ԫ�ص�����������ת k ����
//
//���磬���  n = 7 ,  k = 3����������  [1,2,3,4,5,6,7]  ��������ת��Ľ��Ϊ [5,6,7,1,2,3,4]��
//
//ע��:
//
//�������ҵ�����Ľ���������������������ֲ�ͬ�ķ������������⡣
//
//[��ʾ��ʾ]
//
//��ʾ:
//
//Ҫ��ռ临�Ӷ�Ϊ O(1)
public class XuanzhuanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
//		int nums[] = {-1};
//		int k = 2;
		rotate(nums,k);
		rotate1(nums,k);
		
	}
	public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];//����nums���鳤�����ɺ���һ�����ȵ�����  
        for (int i = 0; i < nums.length; i++)  
        {  
            result[(i + k) % nums.length] = nums[i];//�����õ���ȡ�࣬Ҳ����������ĺ���  
        }
        ///3Ԫ���������е�2λ���ϣ�(2+3) % 7 = 5  
        ///5Ԫ���������е�4λ���ϣ�(4+3) % 7 = 0  
        ///6Ԫ���������е�5λ���ϣ�(5+3) % 7 = 1  
        ///7Ԫ���������е�6λ���ϣ�(6+3) % 7 = 2  
        
		System.out.println(Arrays.toString(result));
	}
	
	// right
	public static void rotate1(int[] nums, int k) {
        int length = nums.length;  
        while (k > 0)//ѭ�����ξͿ�k�Ƕ���  
        {  
            int t = 0;  
            t = nums[length - 1];//���ǻ�ȡ�������λ���ϵ�����  
            for (int j = length - 2; j >= 0; j--)//�ӵ����ڶ������ֿ�ʼ������ѭ����ѭ����ҪĿ�ľ��ǰ���������λ�ö�̧��һλ  
            {  
                nums[j + 1] = nums[j];  
            }  
            nums[0] = t;//̧���������ģ��Ϳ���ֱ�Ӱ����λ�ϵ����ָ�ֵ��0��λ����  
            k--;//���һ��ѭ��  
        }  
		System.out.println(Arrays.toString(nums));
	}

}
