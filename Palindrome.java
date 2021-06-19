class Palindrome
{
    
static Boolean isPalindrome(int x){
       
 String temp=Integer.toString(x);
        
int n=temp.length();
        
for(int i=0;i<n/2;i++)
            
if(temp.charAt(i)!=temp.charAt(n-1-i))
                
return false;
        
return true;
    
}

	
public static int palinArray(int[] a, int n)
{
               
boolean flag=false;
                
for(int x:a){
                    
flag=isPalindrome(x);
                    
if(!flag) return 0;
                
   }
                    
return 1;
           
 }

}