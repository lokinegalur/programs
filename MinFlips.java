class Solution {
    public int minFlips(String S) {
        int n=S.length();
        int x=0,y=0;
        char ch1='1';
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(ch!=ch1)
                x++;
            else
                y++;
            if(ch1=='1')
                ch1='0';
            else
                ch1='1';
        }
        return Math.min(x,y);
    }
}
