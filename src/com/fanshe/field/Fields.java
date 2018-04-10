package com.fanshe.field;
import java.lang.reflect.Field;  
/* 
 * ��ȡ��Ա���������ã� 
 *  
 * 1.������ 
 *      1).Field[] getFields():��ȡ���е�"�����ֶ�" 
 *      2).Field[] getDeclaredFields():��ȡ�����ֶΣ�������˽�С��ܱ�����Ĭ�ϡ����У� 
 * 2.��ȡ�����ģ� 
 *      1).public Field getField(String fieldName):��ȡĳ��"���е�"�ֶΣ� 
 *      2).public Field getDeclaredField(String fieldName):��ȡĳ���ֶ�(������˽�е�) 
 *  
 *   �����ֶε�ֵ�� 
 *      Field --> public void set(Object obj,Object value): 
 *                  ����˵���� 
 *                  1.obj:Ҫ���õ��ֶ����ڵĶ��� 
 *                  2.value:ҪΪ�ֶ����õ�ֵ�� 
 *  
 */ 
public class Fields {
	public static void main(String[] args) throws Exception {  
		//1.��ȡClass����  
		Class stuClass = Class.forName("com.fanshe.field.Student");  
		//2.��ȡ�ֶ�  
		System.out.println("************��ȡ���й��е��ֶ�********************");  
		Field[] fieldArray = stuClass.getFields();  
		for(Field f : fieldArray){  
			System.out.println(f);  
		}  
		System.out.println("************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************");  
		fieldArray = stuClass.getDeclaredFields();  
		for(Field f : fieldArray){  
			System.out.println(f);  
		}  
		System.out.println("*************��ȡ�����ֶ�**������***********************************");  
		Field f = stuClass.getField("name");  
		System.out.println(f);  
		//��ȡһ������  
		Object obj = stuClass.getConstructor().newInstance();//����Student����--��Student stu = new Student();  
		//Ϊ�ֶ�����ֵ  
		f.set(obj, "���»�");//ΪStudent�����е�name���Ը�ֵ--��stu.name = "���»�"  
		//��֤  
		Student stu = (Student)obj;  
		System.out.println("��֤������" + stu.name);  


		System.out.println("**************��ȡ˽���ֶ�****������********************************");  
		f = stuClass.getDeclaredField("phoneNum");  
		System.out.println(f);  
		f.setAccessible(true);//�������䣬���˽���޶�  
		f.set(obj, "18888889999");  
		System.out.println("��֤�绰��" + stu);  

	}  
}

/*�ɴ˿ɼ�
�����ֶ�ʱ����Ҫ��������������
Object obj = stuClass.getConstructor().newInstance();//����Student����--��Student stu = new Student();
//Ϊ�ֶ�����ֵ
f.set(obj, "���»�");//ΪStudent�����е�name���Ը�ֵ--��stu.name = "���»�"
��һ��������Ҫ�������õĶ��󣬵ڶ���������Ҫ����ʵ��*/
