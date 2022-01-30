// https://practice.geeksforgeeks.org/viewSol.php?subId=221a2db10d07b9b1c74c2348bcb2a97e&pid=705111&user=gopalsays108
class Solution{
    static int height(int N){
        int sqrt = (int)Math.sqrt(2*N);
        if(sqrt * (sqrt+1) > 2*N)return sqrt-1;
        return sqrt;
    }
}
