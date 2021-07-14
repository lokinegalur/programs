// Merge sort Algorithm
import java.io.*;

class MergeSort {
    
    static void help(int[] arr,int[] temp,int start,int mid,int end){
        int i=start,j=mid+1,ptr=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[ptr]=arr[i];
                i++;
            }
            else{
                temp[ptr]=arr[j];
                j++;
            }
            ptr++;
        }
        int s,e;
        if(i<=mid){
            s=i;e=mid;
        }
        else{
            s=j;e=end;
        }
        while(s<=e){
            temp[ptr]=arr[s];
            s++;
            ptr++;
        }
        ptr=0;
        while(start<=end){
            arr[start]=temp[ptr];
            start++;
            ptr++;
        }
        
    }
    
    static void merge(int[] arr,int start,int end){
        if(start==end)
            return;
        int mid=start+(end-start)/2;
        merge(arr,start,mid);
        merge(arr,mid+1,end);
        int temp[]=new int[end-start+1];
        help(arr,temp,start,mid,end);
    }
    
	public static void main (String[] args) {
		int arr[]={10,10,9,8,7,6,5,4,3,2,1};
		merge(arr,0,arr.length-1);
		for(int x:arr)
		    System.out.print(x+" ");
	}
}
