/*1. �����಻�ܱ�ʵ����(��ѧ�ߺ����׷��Ĵ�)�������ʵ�������ͻᱨ�������޷�ͨ����ֻ�г�����ķǳ���������Դ�������
2. �������в�һ���������󷽷��������г��󷽷�����ض��ǳ����ࡣ
3. �������еĳ��󷽷�ֻ�������������������壬���ǲ����������ľ���ʵ��Ҳ���Ƿ����ľ��幦�ܡ�
4. ���췽�����෽������static���εķ�������������Ϊ���󷽷���
5. ������������������������еĳ��󷽷��ľ���ʵ�֣����Ǹ�����Ҳ�ǳ����ࡣ*/
package abstractTest;
//import abstractTest.Employee;;

public class AbstractDemo {

	//	public static void main(String[] args) {
	//		  /* �����ǲ�����ģ����������� */
	//	      Employee e = new Employee("George W.", "Houston, TX", 43);
	//	 
	//	      System.out.println("\n Call mailCheck using Employee reference--");
	//	      e.mailCheck();
	//	}


	public static void main(String [] args)
	{
		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();

		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}

}
