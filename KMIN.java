import java.io.*;
import java.lang.*;

class KMIN {
    
    static void minHeap(int[] arr,int i){
        int parent=(i-1)/2;
        while(i!=parent){
            if(arr[i]<arr[parent]){
                int t=arr[i];
                arr[i]=arr[parent];
                arr[parent]=t;
            }
            else
                break;
            i=parent;
            parent=(i-1)/2;
        }
    }
    
    static int extractMin(int[] arr,int k){
        int last=arr.length-1,n=last;
        int i=0,minEle=-1;
        while(i++<k){                                  // number of extractions = k-1
            minEle=arr[0];
            arr[0]=arr[last];
            int j=0;
            while(j<last){                            //parent index(j) until (last-1)
                int lchild=2*j+1;
                int rchild=lchild+1;
                int min=-1,swapIndex=-1;
                if(lchild<last && rchild<last){
                    min=Math.min(arr[lchild],arr[rchild]);
                    if(min==arr[lchild])
                        swapIndex=lchild;
                    else
                        swapIndex=rchild;
                }
                else if(lchild<last){
                    min=arr[lchild];
                    swapIndex=lchild;
                }
                else if(rchild<last){
                    min=arr[rchild];
                    swapIndex=rchild;
                }
                else
                    break;
                if(min<arr[j]){
                    int t=arr[j];
                    arr[j]=arr[swapIndex];
                    arr[swapIndex]=t;
                    j=swapIndex;
                }
                else
                    break;
                }
                last--;
            }
            return minEle;
        }
    
	public static void main (String[] args) {
	    int a[]={7,9,8,2,5,3};
	    int k=3;
	    for(int i=1;i<a.length;i++)
	        minHeap(a,i);
	    for(int i=0;i<a.length;i++)
	        System.out.print(a[i]+" ");
	    int kMin=extractMin(a,k);
	    System.out.println(k+"th minimum element is "+kMin);
	}
}