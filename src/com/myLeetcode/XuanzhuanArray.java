package com.myLeetcode;
import java.util.Arrays;

//
//将包含 n 个元素的数组向右旋转 k 步。
//
//例如，如果  n = 7 ,  k = 3，给定数组  [1,2,3,4,5,6,7]  ，向右旋转后的结果为 [5,6,7,1,2,3,4]。
//
//注意:
//
//尽可能找到更多的解决方案，这里最少有三种不同的方法解决这个问题。
//
//[显示提示]
//
//提示:
//
//要求空间复杂度为 O(1)
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
        int[] result = new int[nums.length];//根据nums数组长度生成和其一样长度的数组  
        for (int i = 0; i < nums.length; i++)  
        {  
            result[(i + k) % nums.length] = nums[i];//这里用到了取余，也是这个方法的核心  
        }
        ///3元素在数组中的2位置上，(2+3) % 7 = 5  
        ///5元素在数组中的4位置上，(4+3) % 7 = 0  
        ///6元素在数组中的5位置上，(5+3) % 7 = 1  
        ///7元素在数组中的6位置上，(6+3) % 7 = 2  
        
		System.out.println(Arrays.toString(result));
	}
	
	// right
	public static void rotate1(int[] nums, int k) {
        int length = nums.length;  
        while (k > 0)//循环几次就看k是多少  
        {  
            int t = 0;  
            t = nums[length - 1];//这是获取数组最高位置上的数字  
            for (int j = length - 2; j >= 0; j--)//从倒数第二个数字开始，倒叙循环。循环主要目的就是把其他数字位置都抬高一位  
            {  
                nums[j + 1] = nums[j];  
            }  
            nums[0] = t;//抬高玩其他的，就可以直接把最高位上的数字赋值到0号位上了  
            k--;//完成一个循环  
        }  
		System.out.println(Arrays.toString(nums));
	}

}
