package com.myLeetcode;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

//  ��Ч����ĸ��λ��
//���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ��һ����ĸ��λ�ʡ�
//
//���磬
//s = "anagram"��t = "nagaram"������ true
//s = "rat"��t = "car"������ false
//
//ע��:
//�ٶ��ַ���ֻ����Сд��ĸ��
//
//�����Ѷ�:
//������ַ������� unicode �ַ���ô�죿�����ܷ������Ľⷨ����Ӧ���������
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
