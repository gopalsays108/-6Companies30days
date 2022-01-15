//LINK:  https://practice.geeksforgeeks.org/viewSol.php?subId=13904afbfd82081d4125484d458895c8&pid=700184&user=gopalsays108

 /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    
class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
      
        while(!queue.isEmpty() && queue.peek() != null){
            Node node = queue.poll();
            if(node.left != null)queue.offer(node.left);
            if(node.right != null)queue.offer(node.right);
            while(queue.peek() != null){
                node.nextRight = queue.peek();
                node = queue.poll();
                if(node.left != null)queue.offer(node.left);
                if(node.right != null)queue.offer(node.right);
            }
            queue.offer(null);
            queue.poll();
        }
    }
}
