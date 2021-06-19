package practice;
import java.lang.Math;
import java.util.Arrays;
public class NEG{
	
	static void swap(int i,int j,int[] arr) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void neg(int[] arr,int n) {
		int start=0,end=n-1;
		while(start!=end) {
			if(arr[start]<0)
				start++;
			else {
				if(arr[end]>0) {
					while(arr[end]>0 && end!=start) end--;
				}
				swap(end,start,arr);
			}
		}
	}
	
	public static void main(String args[]) {
	 int arr[]= {-1,-2,3,-4,5,-6,-8,11,12,-3,6,8};
	 neg(arr,arr.length);
	 for(int x:arr) System.out.print(x+" ");
	}
}
