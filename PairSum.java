class pairSum{
    int getPairsCount(int[] arr, int n, int k) {
      HashMap<Integer,Integer> mp = new HashMap<>();
      for(int i=0;i<n;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
      }
    //for(int i=0;i<n;i++) System.out.print(arr[i]+" :"+mp.get(arr[i])+" ");
    int count = 0;
    for(int i=0;i<n;i++){
        if(mp.getOrDefault(k-arr[i],0)!=0)
            count+=mp.get(k-arr[i]);
        if(k-arr[i]==arr[i])
            count--;
    }
    return  count/2;
}
}