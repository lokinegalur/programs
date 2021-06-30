class LLisPalindrome{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        if(head==null)
            return true;
        if(head.next==null)
            return true;
        Node t=head;
        int num = 0;
        while(t!=null){
            num=num*10+t.data;
            t=t.next;
        }
        String s = Integer.toString(num);
        int n = s.length();
        //System.out.println(s);
        for(int i=0;i<=n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1))
                return false;
        }
        return true;
    }    
}
