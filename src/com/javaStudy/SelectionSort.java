package com.javaStudy;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={15,67,26,43,61,25,84,80,34,70};
        int count=0;
        System.out.println("ago");
        for(int num:arr){
            System.out.print(num+" ");
        }        

        for(int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for(int j = k + 1; j < arr.length; j++){
                if(arr[j] < arr[k]){ 
                    k = j; 
                }
            }
            
            if(i != k){ 
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                count++;
            }    
        }
        System.out.println();
        System.out.println("last");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("s "+count);
    }

}

