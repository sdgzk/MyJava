package com.myLeetcode;
import org.junit.Assert;
import org.junit.Test;

public class CountAndSayc {
	@Test
	public void test() {
	    Assert.assertEquals("1", countAndSay(1));
	    Assert.assertEquals("11", countAndSay(2));
	    Assert.assertEquals("21", countAndSay(3));
	    Assert.assertEquals("1211", countAndSay(4));
	    Assert.assertEquals("111221", countAndSay(5));
	    Assert.assertEquals("312211", countAndSay(6));
	    Assert.assertEquals("13112221", countAndSay(7));
	    Assert.assertEquals("1113213211", countAndSay(8));
	    Assert.assertEquals("31131211131221", countAndSay(9));
	    Assert.assertEquals("13211311123113112211", countAndSay(10));
	}

	public String countAndSay(int n) {

	    if (n <= 0) return "-1";

	    String result = "1";
	    for (int i = 1; i < n; i++) {
	        StringBuilder builder = new StringBuilder();
	        int index = 0;
	        while (index < result.length()) {
	            // ��¼ֵ
	            char val = result.charAt(index);
	            // ��¼����λ��
	            int count = 0;

	            // ��������λ������������ͬ������ʱֹͣ��
	            while (index < result.length() && result.charAt(index) == val) {
	                index++;
	                count++;
	            }

	            // ׷������λ���������
	            builder.append(String.valueOf(count));
	            // ׷������λ����ֵ�������
	            builder.append(val);
	        }
	        result = builder.toString();
	    }
	    return result;
	}
}
//����
//��Ŀ�����ѣ�������Ŀ������Ҳ����ĸ�����ʾ��������˵���������ʱ��˵��ʱ����˵�Ϳ����ˡ�
//
//������Ŀ����������֪����
//
//��˵������1����ͬ����������һ��ʱ����˵��Ҳ���ǡ���������
//����˵��ǰ�����ֲ�ͬʱ������˵����Ҫ��˵��Ҳ���ǡ�һ������
//���ϣ���Ҫ���ǰ����ֵ�ֵ(value)������λ��(count)��¼�����������ַ����仯ʱ׷������λ����ֵ������м��ɡ�
