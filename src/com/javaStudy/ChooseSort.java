package com.javaStudy;

public class ChooseSort {

public static void main(String[] args) {  
        int[] a = { 15,67,26,43,61,25,84,80,34,70};  

        select_sort(a);  
        print_array(a);  
    
}  
  
    public static void select_sort(int[] a) {  
    int k;
    for (int i=0;i<a.length;i++) {
    	k=i;
     for (int j=k+1;j<a.length;j++) {
     	 if(a[k]>a[j]) {
     	 	 k=j;
     	 }
     	 	 
     }
     
     if(i!=k) {
     int temp = a[i];
     a[i] = a[k];
     a[k] = temp;
     }
    	
    }
 
                 
  }  
  
 
  
    public static void print_array(int[] a) {  
        if (a.length == 0)  
            return;  
  
        for (int i : a) {  
            System.out.print(i + " ");  
           
        }  

      }  
   

   
}
