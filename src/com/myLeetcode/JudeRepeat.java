package com.myLeetcode;
import java.util.HashSet;
import java.util.Set;

//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数应该返回 true。如果每个元素都不相同，则返回 false。
public class JudeRepeat {

	public static void main(String args[]) {
		JudeRepeat jr = new JudeRepeat();
		int[] nums = {1,1,3};
		boolean s = jr.containsDuplicate(nums);
		System.out.println(s);
	}
	
	public boolean containsDuplicate(int[] nums) {
		if (nums.length ==0) {
			return false;
		}
//       Set setA = new HashSet();
//       boolean flg = false;
//       
//		for (int i = 0;i < nums.length;i++) {
//			if(setA.contains(nums[i]) ==false) {
//				setA.add(nums[i]);
//			} else {
//				flg = true;
//			}
//		}
//		return flg;
		boolean flg = false;
		Set setA = new HashSet();
		for (int i = 0;i < nums.length;i++) {
			setA.add(nums[i]);
		}
		if (setA.size() == nums.length) {
			return false;
		} else {
			return true;
		}
		
	}
}
