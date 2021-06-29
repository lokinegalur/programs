class SortBySetBit 
{ 
        
    static void swap(Integer[] arr,int i,int j){
        Integer t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    static void insert(Integer arr[],Integer aux[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(aux[j-1]<aux[j]){
                     swap(arr,j,j-1);
                     swap(aux,j,j-1);
                }
                else 
                    break;
            }
        }
    }
    
     static int countSetBits(int n){
       int bits = 0;
       while(n!=0){
           int rem = n%2;
           if(rem==1)
            bits++;
            n=n/2;
       }
       return bits;
   }
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        Integer aux[]=new Integer[arr.length];
	    for(int i=0;i<arr.length;i++)
	         aux[i]=countSetBits(arr[i]);
	    insert(arr,aux);
    } 
}
