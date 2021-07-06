class Kadane{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    //Kadane's Algorithm
    int maxSubarraySum(int arr[], int n){
        int s=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            s=Math.max(s+arr[i],arr[i]);
            ms=Math.max(ms,s);
        }
        return ms;
    }
    
}
