/*package whatever //do not write package name here */

import java.io.*;

class BubbleInsertionSort. {
    
    static void printArray(int[] arr){
        System.out.println();
        for(int x:arr) System.out.print(x+" ");
        System.out.println();
    }
    
    
    static void insertionSort(int[] arr){
        int n=arr.length,j=0,times=0;
        for(int i=1;i<n;i++){
            int ele=arr[i];
            for(j=i-1;j>=0;j--){
                if(ele<arr[j]){
                    times++;
                    arr[j+1]=arr[j];
                }
                else break;
            }
            arr[j+1]=ele;
        }
     System.out.println("Sorting by using insertion sort...");
     printArray(arr);
     //System.out.println("number of swaps "+times); 
    }
    
    
    static void bubbleSort(int[] arr){
        int n=arr.length,times=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    times+=2;
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    System.out.println("Sorting by using Bubble sort...");
    printArray(arr); 
    //System.out.println("number of swaps "+times); 
    }
	public static void main (String[] args) {
		int arr[]={1,9,2,3,4,5,6,9};
		insertionSort(arr);
		int arr2[]={1,9,2,3,4,5,6,9};
		bubbleSort(arr2);
	}
}
