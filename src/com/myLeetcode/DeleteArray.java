package com.myLeetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ������������ɾ���ظ���
//����һ���������飬����Ҫԭ��ɾ�����е��ظ����ݣ�ʹÿ��Ԫ��ֻ����һ��,�������µĳ��ȡ�
//��Ҫ���ⶨ��һ�����飬������ͨ���� O(1) �����ڴ�ԭ���޸������������������һ�㡣

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
        //�ж�������  
        int number = 0;//��Ǽ���  
        for (int i=0; i < nums.length ; i++) {  
            if ( nums[i] != nums[number] ) {  
                number++;  
                nums[number] = nums[i];  
            }  
        }  
        System.out.println("OK"+Arrays.toString(nums));
        number+=1; //���+1��Ϊ���ָ���  
        return number;  
    }  

}
