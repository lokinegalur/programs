public class KMP{
    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<KMP string pattern matching algorithm>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void lps(int[] lps,String s){
        int n=s.length();
        int i=1,j=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(j)){
                lps[i]=j+1;
                i++;j++;
            }
            else{
                if(j==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
        }
    }
    
    static boolean match(String ptrn,String str,int m,int n,int[] lps){
        int i=0,j=0;
        while(i<m && j<n){
            if(ptrn.charAt(i)==str.charAt(j)){
                i++;
                j++;
            }
            else{
                if(i!=0)
                    i=lps[i-1];
                else
                    j++;
            }
        }
        if(i==m)
            return true;
        return false;
    }
    
    public static void main(String args[]){
        String str="acaeaeacdacaeaeacacae";
        String ptrn="acaeaeacacae";
        int m=str.length(),n=ptrn.length();
        int lps[]=new int[n];
        lps(lps,ptrn);
        for(int x:lps)
            System.out.print(x+" ");
        if(match(ptrn,str,n,m,lps))
            System.out.println("pattern matched in String\n");
        else
            System.out.println("pattern not found in String\n");
    }
}
