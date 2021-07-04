//Initial Template for Java
import java.io.*;
import java.util.*;

class MinSwapsForBracketBalancing
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {   
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minimumNumberOfSwaps(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static void swap(char[] arr,int i,int j){
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    static int minimumNumberOfSwaps(String S){
        int swaps=0,n=S.length();
        if(n==0)
            return 0;
        char arr[]=S.toCharArray();
        int open=0,close=0;
        int flag=-1;
        for(int i=0;i<n;i++){
            char ch=arr[i];
            if(ch=='[')
                open++;
            else
                close++;
            if(close>open){
                flag=i+1;
                while(flag<n){
                    if(arr[flag]=='[')
                        break;
                    flag++;
                }
                //System.out.println(i+" "+flag+" ");
                swap(arr,i,flag);
                swaps+=(flag-i);
                //System.out.println(swaps);
                open++;
                close=open-1;
            }
            
            //for(char x:arr) System.out.print(x+", ");
            //System.out.println("open: "+open+" close: "+close);
        }
        return swaps;
    }
}
