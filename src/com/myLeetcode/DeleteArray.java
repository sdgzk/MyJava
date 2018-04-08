package com.myLeetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 从排序数组中删除重复项
//给定一个有序数组，你需要原地删除其中的重复内容，使每个元素只出现一次,并返回新的长度。
//不要另外定义一个数组，您必须通过用 O(1) 额外内存原地修改输入的数组来做到这一点。

public class DeleteArray {

	public static void main(String[] args) {
		DeleteArray da = new DeleteArray();
		int[] nums = {1,1,2};
		da.removeDuplicates(nums);
		int o = da.removeDuplicatesT(nums);
		System.out.println(o);
	}
	
    public int removeDuplicates(int[] nums) {
//        Map<Integer,Integer> m = new HashMap(100);
//        List<Integer> list = new ArrayList(100);
//        for (int i = 0;i < nums.length;i++) {
//            if (m.containsKey(nums[i]) == false) {
//                 m.put(nums[i],0);
//                list.add(nums[i]);
//                
//            } else {
//            }
//                
//           
//        }
//        Integer[] a = list.toArray(new Integer[]{});
//       // System.out.println(Arrays.toString(a));
//        return a.length;
    	
    	int number = 0;
    	for (int i = 0;i < nums.length;i++) {
    		if (nums[i] != nums[number]) {
    			number ++;
    			nums[number] = nums[i];
    		}
    		
    	}
    	
    	return number+1;
    }
    public int removeDuplicatesT(int[] nums) {
    	
        if (nums.length == 0)  
            return 0;  
        //判断无输入  
        int number = 0;//标记计数  
        for (int i=0; i < nums.length ; i++) {  
            if ( nums[i] != nums[number] ) {  
                number++;  
                nums[number] = nums[i];  
            }  
        }  
        System.out.println("OK"+Arrays.toString(nums));
        number+=1; //标记+1即为数字个数  
        return number;  
    }  

}
