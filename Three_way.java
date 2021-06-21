class Solution{

    //Function to partition the array around the range such
 
    //that array is divided into three parts.
 
   public void threeWayPartition(int arr[], int a, int b)
    {

        int i,j,n=arr.length;

        i=0;

        j=n-1;

        while(i<j){

            while(arr[i]<a && i<j)

                i++;

            while(arr[j]>=a && i<j)

                j--;

            int t=arr[i];

            arr[i]=arr[j];

            arr[j]=t;

        }

        j=n-1;

        while(i<j){

            while(arr[i]<=b && i<j)

                i++;

            while(arr[j]>b && i<j)

                j--;

            int t=arr[i];
 
           arr[i]=arr[j];

            arr[j]=t;

        }

        
        //for(int x:arr)System.out.print(x+" ");
    
}

}
