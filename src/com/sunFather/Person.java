package com.sunFather;

import org.junit.Assert;
import org.junit.Test;


class People {
	String name;

	// 没有会编译出错 
	public People() {
		System.out.print(1);
	}

	public People(String name) {
		System.out.print(2);
		this.name = name;
	}
}

class Child extends People {

	People father;

	public Child(String name) {
//		super(name);
		System.out.print(3);
		this.name = name;
		father = new People(name + ":F");
	}

	public Child() {
		System.out.print(4);
	}

}