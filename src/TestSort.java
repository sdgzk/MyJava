import java.util.Arrays;
import java.util.Scanner;
public class TestSort {

	public static void main(String[] args) {
		System.out.println("冒泡排序输入:1"+"  "+"快速排序输入:2"+"  "+"选择排序输入:3");
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

		System.out.println("排序前的数组为："+Arrays.toString(a));
		TestSort  s = new TestSort();

		switch(c) {
		case 1:
			// 冒泡排序
			s.bubbleSort(a);  
			break;
		case 2:
			break;
		case 3:
			s.selectSort(a);
			break;
		}
}

	// 冒泡排序
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
		System.out.println("排序后的数组为："+Arrays.toString(a)); 
	}
	
	// 简单选择排序
	private void selectSort(int[] a) {
		int len = a.length;
		
		System.out.println("排序后的数组为："+Arrays.toString(a)); 
		

	}
}
