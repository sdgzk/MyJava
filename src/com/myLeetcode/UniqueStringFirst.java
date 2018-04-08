package com.myLeetcode;
//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
// 注意事项：您可以假定该字符串只包含小写字母。

import org.junit.Assert;
import org.junit.Test;


public class UniqueStringFirst {

	@Test
	public void testFirstUniqChar() {
        Assert.assertEquals(0, firstUniqChar("leetcode"));
        Assert.assertEquals(2, firstUniqChar("loveleetcode"));
        Assert.assertEquals(-1, firstUniqChar(""));
        Assert.assertEquals(0, firstUniqChar(" "));
        Assert.assertEquals(-1, firstUniqChar(null));
        Assert.assertEquals(-1, firstUniqChar("helloeoh"));
        Assert.assertEquals(4, firstUniqChar("loolm"));
	}
	
    public int firstUniqChar(String s) {
    	if (s == null || "".equals(s)) {
    		return -1;
    	}
    	int index = -1;
    	for (int i = 0;i <s.length();i++) {
    		char a = s.charAt(i);
    		if(s.indexOf(a) == s.lastIndexOf(a)) {
    			index = i;
    			break;
    		}
    	}
    	return index;

    }
}
