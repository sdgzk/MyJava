package com.javaStudy;
public class ArrayTest {

    public static void main(String[] args){

         String a = new String("aw");
        String b = new String("aw");
        
        String c= "aa";
        String d= "aa";
        
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(a==b); // False
        System.out.println(a.equals(b)); // True
        
        
        System.out.println(c==d); // True
        System.out.println(c.equals(d)); // True
        ArrayTest ar = new ArrayTest();
        ar.mod();
 }
    void mod() {
    	int a = 128;
    	System.out.println(a%1);
    	System.out.println(a%2);
    	System.out.println(a%8);
    	System.out.println(Math.floorMod(a, 1));
    }
}

//�ɼ�����������ͬ�����ǵ�hashCodeֵ��һ������ͬ��
//
//2.hashcode 
//hashCode����ʵ���Ϸ��صľ��Ƕ���Ĵ洢��ַ�� 
//�����ȼ��½��ۣ� 
//1���������������ͬ����ô���ǵ�hashCodeֵһ��Ҫ��ͬ�� 
//2��������������hashCode��ͬ�����ǲ���һ����ͬ 
//3.����������ͬ�����ǵ�hashCodeֵ��һ������ͬ�� 
//4.���������hashCodeֵ����ͬ������һ����������ͬ�Ķ���
