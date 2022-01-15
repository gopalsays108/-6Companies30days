//https://practice.geeksforgeeks.org/viewSol.php?subId=fdcff969313e5e3717d8ae3c9fde0308&pid=704560&user=gopalsays108
//User function Template for Java
class Solution{
    static int minSteps(int D){
        int ans = 1;
        int sum = 0;
        while(sum < D){
            sum += ans;
            ans++;
        }
        while((sum - D)%2 != 0){
            sum+= ans;
            ans++;
        }
        return ans-1;
    }
}
