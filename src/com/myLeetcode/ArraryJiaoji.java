package com.myLeetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//�����������飬дһ���������������ǵĽ�����
//
//����:
//���� nums1 = [1, 2, 2, 1], nums2 = [2, 2], ���� [2, 2].
//
//ע�⣺
//
//   ��������ÿ��Ԫ�س��ֵĴ�����Ӧ��Ԫ�������������г��ֵĴ���һ�¡�
//   ���ǿ��Բ�������������˳��
//����:
//
//��������������Ѿ��ź����أ��㽫����Ż�����㷨��
//��� nums1 �Ĵ�С�� nums2 С�ܶ࣬���ַ������ţ�
//���nums2��Ԫ�ش洢�ڴ����ϣ��ڴ������޵ģ��㲻��һ�μ������е�Ԫ�ص��ڴ��У������ô�죿
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
	//��Map������nums1���ַ�������ָ���֮���ӳ��, Ȼ�����nums2���飬�����ǰ�ַ���Map�еĸ�������0��
	// �򽫴��ַ�������res�У�Ȼ��Map�Ķ�Ӧֵ�Լ�1��
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
//	��������������Ȼ�������������ֱ���������������ʼλ�ã�������������������������ȣ�
//	�����ִ������У���������������1�������һ����������������ִ���ڶ�����������1����֮��Ȼ��
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
