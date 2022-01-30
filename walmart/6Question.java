//https://practice.geeksforgeeks.org/viewSol.php?subId=873ce0dd2f7da14755453a24fd609595&pid=701195&user=gopalsays108
class Solution
{
        
    long power(int N,int R)
    {
        long mod = (long)(1e9)+7;
        return solve(N,R, mod);
    }
    public long solve(int base, int power, long mod){
        if(power == 0)return 1;
        if(power == 1)return base;
        long temp = solve(base, power/2, mod);
        temp = (temp * temp)%mod;
        if((power&1) == 1) temp = (temp*base)%mod;
        return temp;
    }

}
