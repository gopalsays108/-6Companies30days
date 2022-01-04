//https://practice.geeksforgeeks.org/viewSol.php?subId=1178db93779563d8de4504ce8586c481&pid=704775&user=gopalsays108
class Solution {
    static Long squaresInChessBoard(Long N) {
        // code here
        
        //formula of sum of square of n number
        return (N * (N + 1) * (2 * N + 1)) / 6;
    }
};
