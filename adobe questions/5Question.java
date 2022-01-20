class Solution
{
    static final int M = (int)Math.pow(10,9)+7;
    static int numOfWays(int n, int x)
    {
        List<Integer> nums = new ArrayList<>();
        int i = 1;
        while(true){
            int k = (int)Math.pow(i,x);
            if(k>n) break;
            nums.add(k);
            i++;
        }
        
        // System.out.println(nums);
        
        long dp[] = new long[n+1];
        dp[0] = 1;
        
        for(i=0;i<nums.size();i++){
            long dpNext[] = new long[n+1];
            for(int j=0; j<=n; j++){
                if(nums.get(i) <= j)
                dpNext[j] = (dp[j] + dp[j-nums.get(i)])%M;
                else
                dpNext[j] = dp[j];
            }
            dp = dpNext;
        }
        
        return (int)dp[n];

    }
}
