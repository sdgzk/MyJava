// 指出下列程序运行的结果 （）
package com.javaStudy;

public class Example {

    String str = new String("good");

    char[] ch = { 'a', 'b', 'c' };

    public static void main(String args[]) {

        Example ex = new Example();

        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");

        System.out.print(ex.ch);

    }

    public void change(String str, char ch[]) {

        str = "test ok";

        ch[0] = 'g';

    }
}

// good and gbc