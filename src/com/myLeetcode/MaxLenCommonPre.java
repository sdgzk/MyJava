package com.myLeetcode;
	import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
	//编写一个函数来查找字符串数组中最长的公共前缀字符串。
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
//	横向扫描：遍历所有字符串，每次跟当前得出的最长公共前缀串进行对比，不断修正，最后得出最长公共前缀串。
//	纵向扫描：对所有串，从字符串第0位开始比较，全部相等则继续比较第1,2...n位，直到发生不全部相等的情况，则得出最长公共前缀串
