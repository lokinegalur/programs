import java.util.Scanner;
public class MaxHeap {
public static void print(int[] arr){
    System.out.println();
    for(int j=1;j<=arr.length-1;j++)
        System.out.print(arr[j]+" ");
    System.out.println();
}
public static void main(String args[]){
 Scanner in=new Scanner(System.in);
 System.out.print("Enter the number of elements\n");
 int n=in.nextInt();
 System.out.println(n);
 int arr[]=new int[n+1];
 System.out.println("Enter the elements");
 for(int i=1;i<=n;i++)
     arr[i]=in.nextInt();
 print(arr);
     
     
         //[-1][9][8][7][6][5][4][1][2][3]
        //index 0 is not considered and index 1 element is already in the max_heap of size 1
        //generating the max_heap
 for(int i=2;i<=n;i++){      // element to be inserted
     int j=i,temp=arr[i];
     while(j>1 && temp>arr[j/2]){          // as long as child arr[j] is greater than  parent arr[j/2]
         arr[j]=arr[j/2];
         j/=2; 
     }
     arr[j]=temp;
 }
 
 System.out.println("After inserting to max_heap");
 print(arr);
 
        //extracting the max ( deleting elements from max_heap) deletions happen index 1 always
 int end=n;
 for(int j=1;j<n;j++){        //n-1 deletions are possible from max_heap since its size is n
 int i=1,temp=arr[end],max=arr[1];
 while(i<end){
     int left=(2*i<end)?arr[2*i]:Integer.MIN_VALUE;
     int right=((2*i+1)<end)?arr[2*i+1]:Integer.MIN_VALUE;
     if(temp>left && temp>right)
        break;
     if(left>temp && left>right){
         arr[i]=left;
         i=2*i;
     }
     else{
         arr[i]=right;
         i=2*i+1;
     }
   }
 arr[i]=temp;arr[end]=max;end--;
 System.out.println("Interation "+j);
 print(arr);
 }
 System.out.println("After heapSort\n");
 print(arr);
 }
}
