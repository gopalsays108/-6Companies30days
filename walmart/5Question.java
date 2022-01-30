//User function template for JAVA

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/
//https://practice.geeksforgeeks.org/viewSol.php?subId=5d9e4ca720b4e4b5189cb4a4f7d26efb&pid=700185&user=gopalsays108
class Solution{
    public void toSumTree(Node root){
        solve(root);
    }
    public static int solve(Node node){
        if(node == null){
            return 0;
        }
        int left = solve(node.left);
        int right = solve(node.right);
        int sum = left+right+node.data;
        node.data = left+right;
        return sum;
    }
}
