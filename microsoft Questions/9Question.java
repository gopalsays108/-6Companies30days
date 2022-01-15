//lINK:https://practice.geeksforgeeks.org/viewSol.php?subId=3823764a7fb3b5433a19220acf64ad21&pid=700689&user=gopalsays108
//User function Template for Java


/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
    public static int ans = 0;
    int countSubtreesWithSumX(Node root, int X)
    {
        ans = 0;
        solve(root , X);
        return ans;
    }
    public static int solve(Node node, int target){
        if(node == null)return 0;
        int sum = node.data;
        sum += solve(node.left, target);
        sum += solve(node.right, target);
        if(sum == target)ans++;
        return sum;
    }
}
