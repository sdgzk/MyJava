import java.lang.Math;
import java.util.Arrays;
public class TestSort1 {
	
	public static void main(String[] args) {
		
		 int []a={15,67,26,43,61,25,84,80,34,70};
	//	 for(int i=1;i<a.length;i++){
		 //	 a[i] = (int)(Math.random()*100);
	//  }
	     
		   System.out.println("before:"+Arrays.toString(a));
		   
		   TestSort1 s=new TestSort1();
		   s.quickSort(a, 1, 9);
		   
		   System.out.println("after:"+Arrays.toString(a));
	}
	
	 public void quickSort(int[]a,int start,int end){
             if(start<end){
                 int baseNum=a[start]; //jizun
                 int midNum; // middle
                 int i=start;
                 int j=end;
                 do{
                     while((a[i]<baseNum)&&i<end){
                         i++;
                      }
                   while((a[j]>baseNum)&&j>start){
                       j--;
                      }
                   if(i<=j){
                       midNum=a[i];
                       a[i]=a[j];
                       a[j]=midNum;
                       i++;
                       j--;
                   }
               }while(i<=j);
                if(start<j){
                    quickSort(a,start,j);
                }       
                if(end>i){
                    quickSort(a,i,end);
                }
           }
                    		   
       }

}