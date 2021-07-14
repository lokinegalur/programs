/*package whatever //do not write package name here */

import java.io.*;

class QuickSort{
    
    static int partition(int[] arr,int start,int end){
        int pivot=arr[end],pIndex=0;
        for(int i=0;i<end;i++){
            if(arr[i]<=pivot){
                int t=arr[i];
                arr[i]=arr[pIndex];
                arr[pIndex]=t;
                pIndex++;
            }
        }
        int t=arr[end];
        arr[end]=arr[pIndex];
        arr[pIndex]=t;
        return pIndex;
    }
    
    static void QuickSort(int[] arr,int start,int end){
        if(start<end){
            int pIndex=partition(arr,start,end);
            QuickSort(arr,start,pIndex-1);
            QuickSort(arr,pIndex+1,end);
        }
    }
    
	public static void main (String[] args) {
	    int arr[]={3,4,2,5,4,3,7,6,7,2,9,3,5};
	    for(int x:arr) System.out.print(x+" ");
	    QuickSort(arr,0,arr.length-1);
	    System.out.println();
	    for(int x:arr) System.out.print(x+" ");
	    
	}
}
