class kmpPre {
    int lps(String s) {
        int i=1,j=0,n=s.length();
        int arr[]=new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(j)){
                while(i<n && s.charAt(i)==s.charAt(j)){
                    arr[i]=j+1;
                    i++;
                    j++;
                }
                if(i<n && arr[i-1]>1){
                    i--;
                }
                j=0;
            }
            else
                i++;
        }
        //for(int x:arr) System.out.print(x+" ");
        return arr[n-1];
    }
}
