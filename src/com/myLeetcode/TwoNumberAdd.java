package com.myLeetcode;
import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoNumberAdd td = new TwoNumberAdd();
		int[] nums= {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(td.twoSum(nums, target)));
		System.out.println(Arrays.toString(td.twoSum1(nums, target)));
	}
	public int[] twoSum(int[] nums, int target) {
		int[] outnums = new int[2];
		for (int i = 0;i <nums.length;i++) {
			for (int j = i+1;j<nums.length;j++) {
				if((nums[i]  +nums[j]) == target) {
					outnums[0] = i;
					outnums[1] = j;
				}
			}
		}
		
		return outnums;

	}
	
	   public int[] twoSum1(int[] nums, int target) {
	        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	        int[] res = new int[2];
	        for (int i = 0; i < nums.length; ++i) {
	            if (m.containsKey(target - nums[i])) {
	                res[0] = i;
	                res[1] = m.get(target - nums[i]);
	                break;
	            }
	            m.put(nums[i], i);
	        }
	        return res;
	    }
	    
}
