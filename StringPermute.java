/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
class StringPermute {
    
    static void per(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String rem = s.substring(0,i)+s.substring(i+1);
            per(rem,ans+ch);
        }
    }
    
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		per(s,"");
	}
}