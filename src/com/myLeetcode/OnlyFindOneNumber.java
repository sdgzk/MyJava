package com.myLeetcode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OnlyFindOneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlyFindOneNumber on = new OnlyFindOneNumber();
		int[] nums = {1,1,2,3,5,5,2};
		int out =on.singleNumber(nums);
		System.out.println(out);
	}

public int singleNumber(int[] nums) {
	
        if (nums.length == 0) {
        	return 0;
        }

        Arrays.sort(nums);
        int num = 0;
        for (int i=0;i<nums.length;i++) {
        	num ^=nums[i];
        }
        return num;
    }
}
