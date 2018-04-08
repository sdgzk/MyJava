package com.myLeetcode;
import java.util.Arrays;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZero mz = new MoveZero();
//		int nums[] = {0, 1, 0, 3, 12};
		int nums[] = {0, 1, 0, 3, 12};
//		mz.moveZeroes(nums);
		mz.moveZeroes2(nums);
	}
	public void moveZeroes(int[] nums) {
		
         for (int i = 0;i<nums.length;i++ ) {
        	 for (int j = i+1;j<nums.length;j++) {
        		 if (nums[i] == 0 ) {
        			 int temp = nums[i];
        			 nums[i] = nums[j];
        			 nums[j] = temp;
        		 }
        	 }
        	 
         }
      //   System.out.println(Arrays.toString(nums));
		
		
	}
	public void moveZeroes2(int[] nums) {
		
		int number = 0;
		int number1 = 0;
		System.out.println(Arrays.toString(nums));
		for (int i = 0;i<nums.length;i++ ) {
			// // 将非0数字都尽可能向前排
			 if (nums[i] != 0 ) {
				 nums[number] = nums[i];  
				 number1 = number;
				 number++;  
			 }
			 System.out.println("i="+i+" date="+Arrays.toString(nums)+"number="+number1);
		}
		
		  // 将剩余的都置0
        for(;number<nums.length; number++){
            nums[number] = 0;
        }
		 System.out.println(Arrays.toString(nums));
			
	}

}
