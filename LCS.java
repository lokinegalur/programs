package practice;
import java.lang.Math;
import java.util.Arrays;
public class LCS{
	
	static int lcs(String s1,String s2,int m,int n) {            // normal recursive
		if(m==0 || n==0)
			return 0;
		if(s1.charAt(m-1)==s2.charAt(n-1))
			return 1+lcs(s1,s2,m-1,n-1);
		else
			return Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
	}
	
	static int memo[][]=new int[6][5];
	
	static int lcsMemo(String s1,String s2,int m,int n) {       //memoization
		if(memo[m][n]==-1) {
			if(m==0||n==0)
				memo[m][n]=0;
			else if(s1.charAt(m-1)==s2.charAt(n-1))
				memo[m][n]=1+lcsMemo(s1, s2, m-1, n-1);
			else
				memo[m][n]=Math.max(lcsMemo(s1,s2,m-1,n),lcsMemo(s1, s2, m, n-1));
		}
		return memo[m][n];
	}
	
	public static void main(String args[]) {
	System.out.println("Normal recursion");
	System.out.println(lcs("AXYZA","BAZA",5,4));
	
	//using memoization
	System.out.println("memoization");
	for(int arr[]:memo)               //filling each row with -1
		Arrays.fill(arr,-1);
	System.out.println(lcsMemo("AXYZA","BAZA",5,4));
	}
}
