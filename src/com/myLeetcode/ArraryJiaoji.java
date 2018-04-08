package com.myLeetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//给定两个数组，写一个方法来计算它们的交集。
//
//例如:
//给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
//
//注意：
//
//   输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
//   我们可以不考虑输出结果的顺序。
//跟进:
//
//如果给定的数组已经排好序呢？你将如何优化你的算法？
//如果 nums1 的大小比 nums2 小很多，哪种方法更优？
//如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
public class ArraryJiaoji {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 2, 1};
		int nums2[] = { 2, 2};
		int r[] = intersect(nums1,nums2);
		System.out.println(Arrays.toString(r));
		int b[] = intersect1(nums1,nums2);
		System.out.println(Arrays.toString(b));
		
	}
	public static  int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer,Integer> mp = new HashMap();
		Map<Integer,Integer> mp1 = new HashMap();
		List<Integer> list = new ArrayList<Integer>(100);
		 for (int i = 0;nums1 != null && i <nums1.length;i++) {
			 if (mp.containsKey(nums1[i]) == false) {
				 mp.put(nums1[i], 1);
			 } else {
				 mp.put(nums1[i], mp.get(nums1[i])+1);
			 }
         
		 }
//		 for(Map.Entry entry: mp.entrySet()){
//			 System.out.println(entry.getKey()+" = "+entry.getValue());
//		 }
		 
		 for (int i = 0;nums2 != null && i <nums2.length;i++) {
			 if (mp1.containsKey(nums2[i]) == false) {
				 mp1.put(nums2[i], 1);
			 } else {
				 mp1.put(nums2[i], mp1.get(nums2[i])+1);
			 }
         
		 }
//		 for(Map.Entry entry: mp1.entrySet()){
//			 System.out.println(entry.getKey()+" = "+entry.getValue());
//		 }
		 Map<Integer,Integer> mp3 = new HashMap();
		 for (int i = 0;nums2 != null &&i <nums2.length;i++) {
			 if (mp.containsKey(nums2[i]) && mp3.containsKey(nums2[i]) == false) {
				 int m1 = mp.get(nums2[i]);
				 int m2 = mp1.get(nums2[i]);
				 int c  = (m1>m2) ? m2 : m1;
				 for (int k = 0;k<c;k++) {
					 list.add(nums2[i]);
				 }
				 mp3.put(nums2[i], 1);
				 
			 }
		 }
		 int r[] = new int[list.size()];
		 
		 list.toArray();
		 for (int i = 0; i < list.size();i++) {
			 r[i] = list.get(i);
		 }

		return r;
	}
	//用Map来建立nums1中字符和其出现个数之间的映射, 然后遍历nums2数组，如果当前字符在Map中的个数大于0，
	// 则将此字符加入结果res中，然后Map的对应值自减1。
	public static  int[] intersect1(int[] nums1, int[] nums2) {
		   List<Integer> tmp = new ArrayList<>();

		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		    for (int i = 0; i < nums1.length; i++) {
		        Integer value = map.get(nums1[i]);
		        map.put(nums1[i], (value == null ? 0 : value) + 1);
		    }

		    for (int i = 0; i < nums2.length; i++) {
		        if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
		            tmp.add(nums2[i]);
		            map.put(nums2[i], map.get(nums2[i]) - 1);
		        }
		    }

		    int[] result = new int[tmp.size()];
		    int i = 0;
		    for (Integer e : tmp)
		        result[i++] = e;
		    return result;
	}
//	给两个数组排序，然后用两个索引分别代表两个数组的起始位置，如果两个索引所代表的数字相等，
//	则将数字存入结果中，两个索引均自增1，如果第一个索引所代表的数字大，则第二个索引自增1，反之亦然。
	public static  int[] intersect2(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		List<Integer> tmp = new ArrayList<>();

		int i = 0;
		int j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums2[j] > nums1[i]) {
				i++;
			} else if (nums2[j] < nums1[i]) {
				j++;
			} else {
				tmp.add(nums1[i]);
				i++;
				j++;
			}
		}

		int[] result = new int[tmp.size()];
		for (int k = 0; k < result.length; k++) {
			result[k] = tmp.get(k);
		}
		return result;
	}
	
}
