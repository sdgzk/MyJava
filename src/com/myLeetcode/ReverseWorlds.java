package com.myLeetcode;
import java.util.Arrays;

public class ReverseWorlds {

	public static void main(String[] args) {
		ReverseWorlds rw = new ReverseWorlds();
		String s = "Let's take LeetCode contest";
		String out = rw.reverseWords(s);
		System.out.println(out);
	}
	 public String reverseWords(String s) {
	     String nums[] =   s.split(" ") ;
	     System.out.println( Arrays.toString(nums));
	     StringBuffer sb = null;
		 for (int i =0;i <nums.length;i++) {
			// char c = nums[]
			 String numStr = nums[i];
			 sb = new StringBuffer();
			 for (int j = numStr.length()-1;j >=0 ;j--) 
			 {
				 char c = numStr.charAt(j);
				 sb.append(c);
			 }
			 nums[i] = sb.toString();
		 }
//		  System.out.println( Arrays.toString(nums));
//	     String outS =  Arrays.toString(nums);
//	     System.out.println(outS);
//	     outS = outS.replace(", ", " ");
		 String outS= "";
		 for (int i =0;i <nums.length;i++) {
			 if (i < nums.length - 1) {
				 outS += nums[i] + " ";
			 } else {
				 outS += nums[i] ;
			 }
			 
		 }
	     return outS;
		 
	        
	    }

}
