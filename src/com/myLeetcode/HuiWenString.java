package com.myLeetcode;
//  ��֤�����ַ���
//����һ���ַ�����ȷ�����Ƿ��ǻ��ģ�ֻ������ĸ�����ַ��ͺ��Դ�Сд��
//
//���磺
//"A man, a plan, a canal: Panama" �ǻ����ַ�����
//"race a car" ���ǻ����ַ�����
//
//ע��:
//���п��ǹ�����ַ��������ǿյ��� ������������һ���ܺõ����⡣
//
//��Դ���Ŀ�����ǽ����ַ�������Ϊ��Ч�Ļ����ַ�����
import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;
public class HuiWenString {


	@Test
	public void test() {
		Assert.assertEquals(true, isPalindrome("A man, a plan, a canal: Panama"));
		Assert.assertEquals(false, isPalindrome("race a car"));
		Assert.assertEquals(true, isPalindrome(""));
		Assert.assertEquals(true, isPalindrome(null));
		Assert.assertEquals(false, isPalindrome("111222"));
		Assert.assertEquals(true, isPalindrome("1221"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(true, isPalindrome1("A man, a plan, a canal: Panama"));
		Assert.assertEquals(false, isPalindrome1("race a car"));
		Assert.assertEquals(true, isPalindrome1(""));
		Assert.assertEquals(true, isPalindrome1(null));
		Assert.assertEquals(false, isPalindrome1("111222"));
		Assert.assertEquals(true, isPalindrome1("1221"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, isPalindrome2("A man, a plan, a canal: Panama"));
		Assert.assertEquals(false, isPalindrome2("race a car"));
		Assert.assertEquals(true, isPalindrome2(""));
		Assert.assertEquals(true, isPalindrome2(null));
		Assert.assertEquals(false, isPalindrome2("111222"));
		Assert.assertEquals(true, isPalindrome2("1221"));
	}
	
	public boolean isPalindrome(String s) {
		if (s == null || "".equals(s)) {
			return true;
		}
		int len = s.length();
		s = s.toLowerCase();
		StringBuffer sb = new StringBuffer();
		for (int  i = 0;i< len;i++) {
			char sx = s.charAt(i);

			if (('a'<=sx && sx <='z') || (sx>='0' && sx <='9')  ) {
				sb.append(sx);
			}
		}
		s = sb.toString();
		len = s.length();
//		System.out.println(s);
		for (int  i = 0;i< len;i++) {
			if (s.charAt(i) != s.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPalindrome1(String s) {
		if (s == null || "".equals(s)) {
			return true;
		}
		s = s.toLowerCase();

		int startIndex = 0;
		int endIndex = s.length() - 1;
		while (startIndex < endIndex && startIndex < s.length() - 1) {
			char pre = s.charAt(startIndex);
			char aft = s.charAt(endIndex);
			if (!((pre >= 'a' && pre <= 'z') || (pre >= '0' && pre <= '9'))) {
				startIndex++;
				continue;
			}
			if (!((aft >= 'a' && aft <= 'z') || (aft >= '0' && aft <= '9'))) {
				endIndex--;
				continue;
			}

			if (pre != aft) {
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}
	
	public boolean isPalindrome2(String s) {
		if (s == null || "".equals(s)) {
			return true;
		}
	    if (s.isEmpty()) {
	        return true;
	    }
	    int head = 0, tail = s.length() - 1;
	    char cHead, cTail;
	    while (head <= tail) {
	        cHead = s.charAt(head);
	        cTail = s.charAt(tail);
	        if (!Character.isLetterOrDigit(cHead)) {
	            head++;
	        } else if (!Character.isLetterOrDigit(cTail)) {
	            tail--;
	        } else {
	            if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
	                return false;
	            }
	            head++;
	            tail--;
	        }
	    }

	    return true;
	}

}
