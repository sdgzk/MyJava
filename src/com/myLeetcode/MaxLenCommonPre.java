package com.myLeetcode;
	import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
	//��дһ�������������ַ�����������Ĺ���ǰ׺�ַ�����
import org.junit.Test;
	
	public class MaxLenCommonPre {
	
		@Test
		public void test() {
			Assert.assertEquals("aa",
					  longestCommonPrefix(new String[]{"aab","aabcd"}));
			Assert.assertEquals("cac",
					longestCommonPrefix1(new String[]{"cacddd","cacefddg","cacdefdfddd"}));
		}
	
		public String longestCommonPrefix(String[] strs) {
			return "";
		}
		public String longestCommonPrefix1(String[] strs) {
		    if(strs.length==0){  
	            return "";  
	        }  
	        int min=Integer.MAX_VALUE;  
	        String minStr="";  
	        for(int i=0;i<strs.length;i++){  
	            if(min>strs[i].length()){  
	                minStr=strs[i];  
	                min=strs[i].length();  
	            }  
	        }  
	        if(min==0){  
	            return "";  
	        }  
	        for(int i=min;i>=0;i--){  
	            String standard=minStr.substring(0, i);  
	            int j=0;  
	            for(j=0;j<strs.length;j++){  
	                if(strs[j].substring(0, i).equals(standard)){  
	                    continue;  
	                }else{  
	                    break;  
	                }  
	            }  
	            if(j==strs.length){  
	                return standard;  
	            }  
	        }  
	        return "";
		}
}
//	����ɨ�裺���������ַ�����ÿ�θ���ǰ�ó��������ǰ׺�����жԱȣ��������������ó������ǰ׺����
//	����ɨ�裺�����д������ַ�����0λ��ʼ�Ƚϣ�ȫ�����������Ƚϵ�1,2...nλ��ֱ��������ȫ����ȵ��������ó������ǰ׺��
