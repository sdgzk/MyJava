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

//可见两个对象不相同，他们的hashCode值不一定不相同。
//
//2.hashcode 
//hashCode方法实际上返回的就是对象的存储地址。 
//可以先记下结论： 
//1、如果两个对象相同，那么它们的hashCode值一定要相同； 
//2、如果两个对象的hashCode相同，它们并不一定相同 
//3.两个对象不相同，他们的hashCode值不一定不相同。 
//4.两个对象的hashCode值不相同，他们一定是两个不同的对象
