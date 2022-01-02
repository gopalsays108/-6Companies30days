//Submission Link: https://practice.geeksforgeeks.org/viewSol.php?subId=27acdc285b7b1b8e5e7182164b47d92d&pid=703804&user=gopalsays108

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        if(k < 1) return 0;
        
        //sliding window approach
        int result = 0;
        long prod = 1;
        
        int left = 0;
        int right =0;
        
        while(right < a.length){
            
            prod *= a[right];
            
            while(prod >= k){
                prod /= a[left];
                left++;
            }
            
            result += right - left +1;
            right++;
        }
        
        return result;
    }
}
