// Link: https://practice.geeksforgeeks.org/viewSol.php?subId=3130fbe89372b96a189bdd398834a17e&pid=702128&user=gopalsays108
class Solution {
   public boolean isPossible(int n, int[][] pre)
   {
       ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(n);
       for(int i=0;i<n;i++){
           adj.add(new ArrayList<Integer>());
       }
       for(int i=0;i<pre.length;i++){
           int row=pre[i][0];
           int col=pre[i][1];
           adj.get(row).add(col);
       }
       int node=-1;
       for(int i=0;i<n;i++){
           if(adj.get(i).size()>0){
               node=adj.get(i).get(0);
               break;
           }
       }
       if(node==-1){
           return false;
       }
       return topological(adj,n,node);
   }
   boolean topological(ArrayList<ArrayList<Integer>> adj,int n,int first){
       int v=0;
       boolean[] visited=new boolean[n];
       Stack<Integer> fin=new Stack<>();
       Stack<Integer> stack=new Stack<>();
       stack.push(first);
       while(v<n&&stack.size()>0){
           int num=stack.pop();
           Stack<Integer> temp=new Stack<>();
           temp.push(num);
           while(true){
               boolean check=false;
               for(int ele:adj.get(temp.peek())){
                   if(!visited[ele]){
                       temp.push(ele);
                       check=true;
                       break;
                   }
                   
               }
               if(!check){
                   int pop=temp.pop();
                   visited[pop]=true;
                   v++;
                   fin.push(pop);
               }
               if(temp.size()>n){
                   return false;
               }
               if(temp.isEmpty()){
                   break;
               }
           }
           for(int i=0;i<n;i++){
               if(!visited[i]){
                   stack.push(i);
                   break;
               }
           }
       }
       return true;
   }
   
}
