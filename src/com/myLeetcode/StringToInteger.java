package com.myLeetcode;
//实现 atoi，将字符串转为整数。
//
//提示：仔细考虑所有输入情况。如果你想挑战自己，请不要看下面并自己考虑所有可能的输入情况。
//
//说明：这题解释的比较模糊（即没有指定输入格式）。你得事先汇集所有的输入情况。

// atoi的要求：
//
//这个函数需要丢弃之前的空白字符，直到找到第一个非空白字符。之后从这个字符开始，选取一个可选的正号或负号后面跟随尽可能多的数字，并将其解释为数字的值。
//
//字符串可以在形成整数的字符后包括多余的字符，将这些字符忽略，这些字符对于函数的行为没有影响。
//
//如果字符串中的第一个非空白的字符不是有效的整数，或者没有这样的序列存在，字符串为空或者只包含空白字符则不进行转换。
//
//如果不能执行有效的转换，则返回 0。如果正确的值超过的可表示的范围，则返回 INT_MAX（2147483647）或 INT_MIN（-2147483648）。
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
				// 检查溢出情况
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
				// 检查溢出情况
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

//通用方法
//复杂度
//时间 O(n) 空间 O(1)
//
//思路
//字符串题一般考查的都是边界条件、特殊情况的处理。所以遇到此题一定要问清楚各种条件下的输入输出应该是什么样的。这里已知的特殊情况有：
//
//能够排除首部的空格，从第一个非空字符开始计算
//允许数字以正负号(+-)开头
//遇到非法字符便停止转换，返回当前已经转换的值，如果开头就是非法字符则返回0
//在转换结果溢出时返回特定值，这里是最大/最小整数
//注意
//检查溢出时最大整数要先减去即将加的最末位再除以10，来处理"2147483648"类似的情况
//可以参考glibc中stdlib/atoi.c的实现方法
