//Link: https://practice.geeksforgeeks.org/viewSol.php?subId=78aa8708f8daca6b5f4f227ea1b2bdfb&pid=704532&user=gopalsays108
// User function Template for Java
class Solution {
   static int maxProfit(int k, int n, int A[]) {
       // code here
       int dp[][]=new int[k+1][n];
       int max_so=Integer.MIN_VALUE;
       for(int i=1;i<=k;i++)
       {
           max_so=Integer.MIN_VALUE;
           for(int j=1;j<n;j++)
           {
               max_so=Math.max(max_so,dp[i-1][j-1]-A[j-1]);
               dp[i][j]=Math.max(dp[i][j-1],max_so+A[j]);
           }
       }
       return dp[k][n-1];
   }
}
