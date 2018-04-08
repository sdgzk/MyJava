package com.myLeetcode;
//ʵ�� atoi�����ַ���תΪ������
//
//��ʾ����ϸ��������������������������ս�Լ����벻Ҫ�����沢�Լ��������п��ܵ����������
//
//˵����������͵ıȽ�ģ������û��ָ�������ʽ����������Ȼ㼯���е����������

// atoi��Ҫ��
//
//���������Ҫ����֮ǰ�Ŀհ��ַ���ֱ���ҵ���һ���ǿհ��ַ���֮�������ַ���ʼ��ѡȡһ����ѡ�����Ż򸺺ź�����澡���ܶ�����֣����������Ϊ���ֵ�ֵ��
//
//�ַ����������γ��������ַ������������ַ�������Щ�ַ����ԣ���Щ�ַ����ں�������Ϊû��Ӱ�졣
//
//����ַ����еĵ�һ���ǿհ׵��ַ�������Ч������������û�����������д��ڣ��ַ���Ϊ�ջ���ֻ�����հ��ַ��򲻽���ת����
//
//�������ִ����Ч��ת�����򷵻� 0�������ȷ��ֵ�����Ŀɱ�ʾ�ķ�Χ���򷵻� INT_MAX��2147483647���� INT_MIN��-2147483648����
import org.junit.Assert;
import org.junit.Test;

//import MainClass;
public class StringToInteger {

	//@Test
	public void test() {
		Assert.assertEquals(1, myAtoi("1"));;
		Assert.assertEquals(12, myAtoi("12a"));;
		Assert.assertEquals(121, myAtoi("+121a2a"));;
		Assert.assertEquals(0, myAtoi("-sdf12a"));;
		Assert.assertEquals(-1212, myAtoi("-1212a"));;
		Assert.assertEquals(1212, myAtoi("   1212a"));;
		Assert.assertEquals(0, myAtoi("+   1212a"));;
		Assert.assertEquals(Integer.MAX_VALUE, myAtoi("121112122222a"));;
		Assert.assertEquals(Integer.MIN_VALUE, myAtoi("-121112122222a"));;
		Assert.assertEquals(0, myAtoi(null));;
	}
	@Test
	public void test1() {
		Assert.assertEquals(1, myAtoi1("1"));;
		Assert.assertEquals(12, myAtoi1("12a"));;
		Assert.assertEquals(121, myAtoi1("+121a2a"));;
		Assert.assertEquals(0, myAtoi1("-sdf12a"));;
		Assert.assertEquals(-1212, myAtoi1("-1212a"));;
		Assert.assertEquals(1212, myAtoi1("   1212a"));;
		Assert.assertEquals(0, myAtoi1("+   1212a"));;
		Assert.assertEquals(Integer.MAX_VALUE, myAtoi1("121112122222a"));;
		Assert.assertEquals(Integer.MIN_VALUE, myAtoi1("-121112122222a"));;
//		Assert.assertEquals(0, myAtoi1(null));;
	}
	public int myAtoi(String str) {

		if (str == null || str.isEmpty()) return 0;
		int sign = 1, base = 0, i = 0, n = str.length();
		while (i < n && str.charAt(i) == ' ') ++i;
		if (str.charAt(i) == '+' || str.charAt(i) == '-') {
			sign = (str.charAt(i++) == '+') ? 1 : -1;
		}
		while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			base = 10 * base + (str.charAt(i++) - '0');
		}
		return base * sign;
	}


	public int myAtoi1(String str) {     
		str = str.trim();
		int result = 0;
		boolean isPos = true;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(i==0 && (c=='-'||c=='+')){
				isPos = c=='+'?true:false;
			} else if (c>='0' && c<='9'){
				// ���������
				if(result>(Integer.MAX_VALUE - (c - '0'))/10){
					return isPos? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result *= 10;
				result += c - '0';
			} else {
				return isPos?result:-result;
			}
		}
		return isPos?result:-result;
	}

	public int myAtoi2(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		int result = 0;
		boolean isPos = true;
		int j = 0;
		while (j < str.length() && str.charAt(j) == ' ') ++j;
		for(int i = j; i < str.length(); i++){
			char c = str.charAt(i);
			if(i==j && (c=='-'||c=='+')){
				isPos = c=='+'?true:false;
			} else if (c>='0' && c<='9'){
				// ���������
				if(result>(Integer.MAX_VALUE - (c - '0'))/10){
					return isPos? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result *= 10;
				result += c - '0';
			} else {
				return isPos?result:-result;
			}
		}
		return isPos?result:-result;
	}
}

//ͨ�÷���
//���Ӷ�
//ʱ�� O(n) �ռ� O(1)
//
//˼·
//�ַ�����һ�㿼��Ķ��Ǳ߽���������������Ĵ���������������һ��Ҫ��������������µ��������Ӧ����ʲô���ġ�������֪����������У�
//
//�ܹ��ų��ײ��Ŀո񣬴ӵ�һ���ǿ��ַ���ʼ����
//����������������(+-)��ͷ
//�����Ƿ��ַ���ֹͣת�������ص�ǰ�Ѿ�ת����ֵ�������ͷ���ǷǷ��ַ��򷵻�0
//��ת��������ʱ�����ض�ֵ�����������/��С����
//ע��
//������ʱ�������Ҫ�ȼ�ȥ�����ӵ���ĩλ�ٳ���10��������"2147483648"���Ƶ����
//���Բο�glibc��stdlib/atoi.c��ʵ�ַ���
