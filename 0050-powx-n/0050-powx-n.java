class Solution {
    public double myPowHelper(double x, long n){
        double result;
        if(n<0){
            x = 1/x;
            n = -n;
        }
        if(n<=0){
            return 1;
        }
        if(n%2==0){
            return result = myPowHelper(x*x,n/2);
        }else{
            return result = x*myPowHelper(x*x,(n-1)/2);
        }

    }
    public double myPow(double x, int n) {
        long a = n;
        return myPowHelper(x,a);
    }
}