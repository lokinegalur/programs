import java.util.*;
import java.lang.*;
class FibMemTab{
    static int memo[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    static int fibMemo(int n){
        if(memo[n]==-1){
            int res;
            if(n==0 || n==1)
                res=n;
            else
                res=fibMemo(n-1)+fibMemo(n-2);
            memo[n]=res;
        
        }
        
            return memo[n];
    }
    
    static int fibTab(int n){
        int F[]=new int[n+1];
        F[0]=0;
        F[1]=1;
        for(int i=2;i<=n;i++)
            F[i]=F[i-1]+F[i-2];
        return F[n];
    }
    
    public static void main(String args[]){

        System.out.println("fib(10) by memoization is "+fibMemo(10));
        System.out.println("fib(10) by tabulation is "+fibTab(10));
    }
}