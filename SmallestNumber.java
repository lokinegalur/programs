class SmallestNumber{
    static String smallestNumber(int S, int D){
       if(S<1 || S>9*D)
            return "-1";
       else{
           String str="";
           int T=D;
           for(int i=1;i<=D;i++){
               //System.out.println("i= "+i);
               if(i==1){
                   int val=S-9*(D-1);
                   if(val<=0)
                        val=1;
                   S-=val;
                   str=Integer.toString(val);
                   //System.out.println(val);
               }
               else{
                   int val=S-9*(T-1);
                   if(val<0)
                        val=0;
                   S-=val;
                   str=str+Integer.toString(val);
                   //System.out.println(val);
               }
               T--;
           }
           return str;
       }
    }
}
