class SecondMostRepeatedString
{
    String secFrequent(String arr[], int N)
    {
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i=0;i<N;i++){
            if(mp.getOrDefault(arr[i],-1)==-1)
                mp.put(arr[i],1);
            else
                mp.put(arr[i],mp.get(arr[i])+1);
        }
        int max=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
        for(Integer x:mp.values()){
            max=Math.max(max,x);
        }
        
        for(Integer x:mp.values()){
            if(x!=max){
                sec=Math.max(sec,x);
            }
        }
        String f="";
        for(String x:arr){
            if(mp.get(x)==sec)
                f=x;
                
        }
        
        return f;
    }
}
