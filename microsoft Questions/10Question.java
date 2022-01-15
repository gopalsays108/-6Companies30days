// https://practice.geeksforgeeks.org/viewSol.php?subId=f298530be431cdb136e777f02cf00416&pid=701417&user=gopalsays108
class Solution
{ 
    public int FindMaxSum(int arr[], int n)
    {
        if(n == 1)return arr[0];
        
        else if(n == 2)return Math.max(arr[0], arr[1]);
        
        int dp [] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int i = 2 ; i < n ; i++){
            dp[i] = Math.max(dp[i-2]+arr[i] , dp[i-1]);
        }
        return dp[n-1];
    }
}
