/*package whatever //do not write package name here */

import java.io.*;

class npr {
    static int P1(int n,int k){         // time  O(n) space O(n)
        if(k>n)
            return 0;
        int F[]=new int[n+1];
        F[0]=1;
        for(int i=1;i<=n;i++)
            F[i]=i*F[i-1];
        return F[n]/F[n-k];
    }
    
    static int P2(int n,int k){        // time O(n) space O(1)
        if(k>n)
        return 0;
        int nPk=1;
        k=n-k;
        while(n!=k){
            nPk=nPk*n;
            n--;
        }
        return nPk;
    }
    
	public static void main (String[] args) {
		System.out.println(P1(10,0));
		System.out.println(P2(10,0));
	}
}
