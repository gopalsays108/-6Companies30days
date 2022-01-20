// https://practice.geeksforgeeks.org/viewSol.php?subId=319a8887056429d2432b48d79a1d30e8&pid=704573&user=gopalsays108

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for(int i = 0 ; i < N ; i++)sum += arr[i];
        if((sum&1) == 1)return 0;
        sum /= 2;
        boolean dp [][] = new boolean[N+1][sum+1];
        dp[0][0] = true;
        for(int i = 1 ; i <= N ; i++){
            for(int j = 0 ; j <= sum ; j++){
                if(dp[i-1][j])dp[i][j] = true;
                else if(j-arr[i-1] < 0)continue;
                else{
                    if(dp[i-1][j-arr[i-1]])dp[i][j] = true;
                }
            }
        }
        if(dp[N][sum])return 1;
        return 0;
    }
}
