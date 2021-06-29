class CountSquare {
    static int countSquares(int N) {
        double x = Math.log(N)/Math.log(2);
        x = 0.5*x;
        x = Math.pow(2,x);
        int s = (int)x;
        if(s*s==N)
            return s-1;
        else
            return s;
    }
}
