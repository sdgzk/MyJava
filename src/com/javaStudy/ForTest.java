package com.javaStudy;
public class ForTest  
{  
	public static void main(String[] args)  
	{  
		ForTest ff= new ForTest();
//		ff.printLx();
		
		//�����ϰ벿��  
		for(int i=1;i<=10;i++)  
		{  
			//�ϰ벿�ֿո�ѭ��  
			for(int j=10;j>=i;j--)  
			{  
				System.out.print(" ");  
			}  
			//�ϰ벿������ѭ��  
			for(int k=1;k<i*2;k++)  
			{  
				System.out.print("*");  
			}  
			System.out.println();  
		}  

		//�����°벿��  
		for(int l=1;l<10;l++)  
		{  
			//�°벿�ֿո�ѭ��  
			for(int m=0;m<=l;m++)  
			{  
				System.out.print(" ");  
			}  
			//�°벿������ѭ��  
			for(int n=19;n>l*2;n--)  
			{  
				System.out.print("*");  
			}  
			System.out.println();  
		}  
		
	}
	 void printLx() {
		 
		 for (int i = 1;i <= 10;i++) {
			 int k1 = 0;
				//�ϰ벿�ֿո�ѭ��  
				for(int j=10;j>=i;j--)  
				{ k1++;
					System.out.print(" ");  
				}  
//				//�ϰ벿������ѭ��  
//				for(int k=1;k<i*2;k++)  
//				{  
//					System.out.print("*");  
//				} 
				System.out.println(); 
				
				
		 }
		 
	 }
} 