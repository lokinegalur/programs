class FirstLastSorted {
    
    static int lower_bound(int[] arr,int target){
        int l=0,h=arr.length-1,bound=-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==target){
                bound=mid;
                h=mid-1;
                //System.out.println("lower bound index :"+bound);
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
           
        }
         return bound;
    }
    
    static int upper_bound(int[] arr,int target){
        int l=0,h=arr.length-1,bound=-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==target){
                bound=mid;
                l=mid+1;
                //System.out.println("upper bound index :"+bound);
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        return bound;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=lower_bound(nums,target);
        arr[1]=upper_bound(nums,target);
        return arr;
    }
}