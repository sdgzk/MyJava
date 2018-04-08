package com.myLeetcode;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

//  有效的字母异位词
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
//
//例如，
//s = "anagram"，t = "nagaram"，返回 true
//s = "rat"，t = "car"，返回 false
//
//注意:
//假定字符串只包含小写字母。
//
//提升难度:
//输入的字符串包含 unicode 字符怎么办？你能能否调整你的解法来适应这种情况？
public class Letterheterotopic {

	@Test
	public void testIsAnagram() {
		//fail("Not yet implemented");
		assertEquals(true, isAnagram("anagram", "nagaram"));
		assertEquals(false, isAnagram("rat ", "car"));
	}
	
	@Test
	public void testIsAnagram1() {
		//fail("Not yet implemented");
		assertEquals(true, isAnagram1("anagram", "nagaram"));
//		assertEquals(false, isAnagram1("rat ", "car"));
	}
	
	
	public  boolean isAnagram(String s, String t) {


//		int[] alphabet = new int[26];
//		for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
//		for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
//		for (int i : alphabet) if (i != 0) return false;
        if (s.length() != t.length())  
            return false;  
  
        int[] sArray = new int[26];  
        int[] tArray = new int[26];  
  
        for (int i = 0; i < s.length(); i++) {  
            sArray[s.charAt(i)-97] ++;  
            tArray[t.charAt(i)-97] ++;  
        }  
  
        for (int i = 0; i < 26; i++)   
            if (sArray[i]!=tArray[i])  
                return false;  
  
        return true;  
	}
	
	
	public boolean isAnagram1(String s, String t) {
		int[] alphabet = new int[26];
		for (int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++){
			alphabet[t.charAt(i) - 'a']--;
		}
		for (int i : alphabet) {
			if (i != 0) return false;
		}
		return true;
	}

}
