//https://practice.geeksforgeeks.org/viewSol.php?subId=f785468ffebbe1ecb874683fcd916806&pid=700357&user=gopalsays108

class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!stack.empty() && stack.peek() <= arr.get(i))stack.pop();
            stack.push(arr.get(i));
            if(stack.size() == 3){
                while(!stack.empty()){
                    ans.add(stack.pop());
                }
                break;
            }
        }
        return ans;
    }
}
