package com.fanshe.method;

import java.lang.reflect.Method;  

/* 
 * ��ȡ��Ա���������ã� 
 *  
 * 1.�����ģ� 
 *      public Method[] getMethods():��ȡ����"���з���"���������˸���ķ���Ҳ����Object�ࣩ 
 *      public Method[] getDeclaredMethods():��ȡ���еĳ�Ա����������˽�е�(�������̳е�) 
 * 2.��ȡ�����ģ� 
 *      public Method getMethod(String name,Class<?>... parameterTypes): 
 *                  ������ 
 *                      name : �������� 
 *                      Class ... : �βε�Class���Ͷ��� 
 *      public Method getDeclaredMethod(String name,Class<?>... parameterTypes) 
 *  
 *   ���÷����� 
 *      Method --> public Object invoke(Object obj,Object... args): 
 *                  ����˵���� 
 *                  obj : Ҫ���÷����Ķ��� 
 *                  args:���÷�ʽʱ�����ݵ�ʵ�Σ� 
 
): 
 */  
public class MethodClass {  
  
    public static void main(String[] args) throws Exception {  
        //1.��ȡClass����  
        Class stuClass = Class.forName("fanshe.method.Student");  
        //2.��ȡ���й��з���  
        System.out.println("***************��ȡ���еġ����С�����*******************");  
        stuClass.getMethods();  
        Method[] methodArray = stuClass.getMethods();  
        for(Method m : methodArray){  
            System.out.println(m);  
        }  
        System.out.println("***************��ȡ���еķ���������˽�е�*******************");  
        methodArray = stuClass.getDeclaredMethods();  
        for(Method m : methodArray){  
            System.out.println(m);  
        }  
        System.out.println("***************��ȡ���е�show1()����*******************");  
        Method m = stuClass.getMethod("show1", String.class);  
        System.out.println(m);  
        //ʵ����һ��Student����  
        Object obj = stuClass.getConstructor().newInstance();  
        m.invoke(obj, "���»�");  
          
        System.out.println("***************��ȡ˽�е�show4()����******************");  
        m = stuClass.getDeclaredMethod("show4", int.class);  
        System.out.println(m);  
        m.setAccessible(true);//���˽���޶�  
        Object result = m.invoke(obj, 20);//��Ҫ����������һ����Ҫ���õĶ��󣨻�ȡ�з��䣩��һ����ʵ��  
        System.out.println("����ֵ��" + result);  
          
          
    }  
}  

/*�ɴ˿ɼ���
m = stuClass.getDeclaredMethod("show4", int.class);//�����ƶ����������а���˽�еģ�����Ҫ����������������һ���ǵ��õķ������ƣ��ڶ����Ƿ������β����ͣ��м������͡�
System.out.println(m);
m.setAccessible(true);//���˽���޶�
Object result = m.invoke(obj, 20);//��Ҫ����������һ����Ҫ���õĶ��󣨻�ȡ�з��䣩��һ����ʵ��
System.out.println("����ֵ��" + result);
��ʵ����ĳ�Ա��������ģ����������һ�ʣ�������Щsetter����������getter()�����������ֶ���ɣ���Щ��������ʡ�����
*/