public class CountSetBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int setBits = 0;
        int temp=1;
        if(n<0){
            temp=n;
            n=Math.abs(n);
            n=n^Integer.MAX_VALUE;
            n=n+1;
        }
        while(n>0){
            if(n%2==1)
                setBits++;
            System.out.println(setBits);
            n=n/2;
        }
        return temp<0?setBits+1:setBits;
    }
}
