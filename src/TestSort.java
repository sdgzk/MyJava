import java.util.Arrays;
import java.util.Scanner;
public class TestSort {

	public static void main(String[] args) {
		System.out.println("ð����������:1"+"  "+"������������:2"+"  "+"ѡ����������:3");
		System.out.println();
		System.out.println();
		Scanner sc =new Scanner(System.in);
		int c = sc.nextInt();
		sc.close();
		System.out.println();
		int []a=new int[10];
		for(int i=1;i<a.length;i++){
			a[i]=(int)(Math.random()*100);
		}

		System.out.println("����ǰ������Ϊ��"+Arrays.toString(a));
		TestSort  s = new TestSort();

		switch(c) {
		case 1:
			// ð������
			s.bubbleSort(a);  
			break;
		case 2:
			break;
		case 3:
			s.selectSort(a);
			break;
		}
}

	// ð������
	private void bubbleSort(int[] a) {
		int len = a.length;
		for (int i =0;i < len;i++) {
			for (int j = i+1;j< len;j++) {
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println("����������Ϊ��"+Arrays.toString(a)); 
	}
	
	// ��ѡ������
	private void selectSort(int[] a) {
		int len = a.length;
		
		System.out.println("����������Ϊ��"+Arrays.toString(a)); 
		

	}
}
