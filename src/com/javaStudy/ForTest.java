package com.javaStudy;
public class ForTest  
{  
	public static void main(String[] args)  
	{  
		ForTest ff= new ForTest();
//		ff.printLx();
		
		//菱形上半部分  
		for(int i=1;i<=10;i++)  
		{  
			//上半部分空格循环  
			for(int j=10;j>=i;j--)  
			{  
				System.out.print(" ");  
			}  
			//上半部分菱形循环  
			for(int k=1;k<i*2;k++)  
			{  
				System.out.print("*");  
			}  
			System.out.println();  
		}  

		//菱形下半部分  
		for(int l=1;l<10;l++)  
		{  
			//下半部分空格循环  
			for(int m=0;m<=l;m++)  
			{  
				System.out.print(" ");  
			}  
			//下半部分菱形循环  
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
				//上半部分空格循环  
				for(int j=10;j>=i;j--)  
				{ k1++;
					System.out.print(" ");  
				}  
//				//上半部分菱形循环  
//				for(int k=1;k<i*2;k++)  
//				{  
//					System.out.print("*");  
//				} 
				System.out.println(); 
				
				
		 }
		 
	 }
} 