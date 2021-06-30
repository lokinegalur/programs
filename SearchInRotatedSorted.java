class  SearchInRotatedSorted{
    
    static int bin(int[] arr,int target,int start,int end){
        int l=start,h=end;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target){
                l = mid+1;
            }
            else
                h = mid - 1;
        }
        return -1;
    }
    
    public int search(int[] arr, int target) {
        int n=arr.length;
        if(n==1){
            if(arr[0]==target)
                return 0;
            return -1;
        }
            
        int pivot = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                pivot=i;
                break;
            }
        }
         System.out.println("pivot: "+pivot);
         int left = bin(arr,target,0,pivot);
         int right = bin(arr,target,pivot+1,n-1);
        return left!=-1?left:right;
    }
}
