package com.myLeetcode;
import java.util.ArrayList;
import java.util.List;

public class SelfDivdingNumber {

	public static void main(String[] args) {
		SelfDivdingNumber s = new SelfDivdingNumber();
		int left = 1;
		int right = 22;
//		List lst = s.selfDividingNumbers(left, right);
//		System.out.println(lst);
		Solution s1 = new Solution();
		List lst2= s1.selfDividingNumbers(left, right);
		System.out.println(lst2);
	}
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> lst = new ArrayList<Integer>(100);
		boolean flg;
		for (int i = left ;i < right + 1;i++) {
			if (i == 0) {
				continue;
			}
			int a = i; 
			int s = 0;
			flg = true;
			while (a > 0)
			{

				s = a%10;
				if( s!=0 && i%s != 0 || s== 0) {
					flg = false;
				} 
				
				a = a/10;
			}
			if (flg ==true) {
				lst.add(i);
			}

		}
		return lst;
	}
}

class Solution {  
    public List<Integer> selfDividingNumbers(int left, int right) {  
        //�����߽�ֵ�����߽�ֵ��������������Ԫ���Ƿ������Գ�������������ÿһλ����������  
        List<Integer> list =new ArrayList<Integer>();  
        for(int i=left;i<=right;i++){  
            if(isSelfDivid(i)){  
                list.add(i);  
            }  
        }  
        return list;  
    }  
    //�жϸ����Ƿ������Գ���(��������λ�������κ�0)  
    public boolean isSelfDivid(int num){  
        int temp=num;  
          
        while(temp>0){  
            //�κ�λ��λ0�����жϸó�����Ϊ0��������false  
            if(temp%10==0||num%(temp%10)>0) return false;  
            temp/=10;  
        }  
  
        return true;  
    }  
}  