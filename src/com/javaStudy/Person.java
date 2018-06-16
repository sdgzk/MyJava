package com.javaStudy;

class Person {

	private String name;

	private String sex;

	public Person(String x, String y) {
		this.name = x;
		this.sex = y;
	}

	// ��дtoString()�������������
	public String toString() {

		return name + " " + sex;
	}

	// ������������
	public static void swapObject(Person p1, Person p2) {
		Person tmp = p1;
		p1 = p2;
		p2 = tmp;
	}

	// ������������
	public static void swapInt(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}

	// ������������
	public static void swapObjectArray(Person[] p1, Person[] p2) {
		Person[] tmp = p1;
		p1 = p2;
		p2 = tmp;
	}

	// ����������������
	public static void swapIntArray(int[] x, int[] y) {
		int[] tmp = x;
		x = y;
		y = tmp;
	}

	// �ı���������е�����
	public static void changeObjectArray(Person[] p1, Person[] p2) {
		Person tmp = p1[1];
		p1[1] = p2[1];
		p2[1] = tmp;

		// �ٽ�p1[1]�޸�
		Person p = new Person("wjl", "male");
		p1[1] = p;
	}

	// �ı�������������е�����
	public static void changeIntArray(int[] x, int[] y) {
		int tmp = x[1];
		x[1] = y[1];
		y[1] = tmp;

		x[1] = 5;
	}
}

