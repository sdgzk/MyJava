// 输入 一个正整数n ,打印1到n，从小到大 递归
package com.javaStudy;

public class JinxiandaiDIGUI {

	public static void main(String[] args) {
		JinxiandaiDIGUI a = new JinxiandaiDIGUI();
        int n = 8;
		a.printN(n);
	}

	void printN(int n) {
		if (n > 1) {
			printN(n-1);
		}
		System.out.print(n + " ");
	}
}
