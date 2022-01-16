// https://practice.geeksforgeeks.org/viewSol.php?subId=f4e5d9e1ee7d9c2f5b5d23070166838e&pid=702078&user=gopalsays108
class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> arr = new ArrayList<>();
        backtrack(arr,"",0, 0, n);
        return arr;
        
    }
    
    public void backtrack(List<String> arr, String current_string, int open, int close, int max){
        if(current_string.length() == max * 2){ //Some base case
            arr.add(current_string);
            return;
        }
        
        if(open < max) backtrack(arr, current_string + "(", open + 1 , close, max );
        if(close < open) backtrack(arr, current_string + ")", open, close + 1, max);
    }
}
