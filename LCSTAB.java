import java.lang.Math;
public class LCSTAB{
    //LCS using tabulation
    static int dp[][]=new int[5][4];
    
    static int lcsTab(String s1,String s2,int m,int n){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        for(int row[]:dp){
            for(int x:row)
                System.out.print(x+" ");
            System.out.println();
        }
        return dp[m][n];
    }
    
    public static void main(String args[]){
        int lcs=lcsTab("AXYZ","BAZ",4,3);
        System.out.println(lcs);
    }
}
