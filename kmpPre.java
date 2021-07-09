class kmpPre {
    int lps(String s) {
        int i=1,j=0,n=s.length();
        int lps[]=new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(j)){
               lps[i]=j+1;
               i++;
               j++;
            }
            else{
                if(j!=0)
                    j=lps[j-1];
                else{
                    i++;
                    j=0;
                }
            }
        }
        //for(int x:lps) System.out.print(x+" ");
        return lps[n-1];
    }
}
