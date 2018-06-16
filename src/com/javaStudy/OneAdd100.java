/** 利用递归函数实现1 + 2 + 3 ... 100  **/
package com.javaStudy;

public class OneAdd100 {

	public static void main(String[] args) {
		OneAdd100 oa = new OneAdd100();           

		int sum = oa.sum(100) ;
		System.out.println(sum);

	}
	int sum = 0;
	public int sum(int n ) {
		if (n>0) {
			System.out.print(n+ " ");
			return  n + sum(n-1);
		}
		return 0;
	}

}
