package com.javaStudy;

public class Calculate {
	private Calculate(){
        throw new Error("请不要实例化我！");
    }
    public static int add(int a,int b){
        return a + b;
    }

    public static int substract(int a,int b){
        return a - b;
    }

    public static int multiply(int a,int b){
        return a * b;
    }

    public static int divide(int a,int b){
        return a / b;
    }
}
