//LINK: https://practice.geeksforgeeks.org/viewSol.php?subId=7a41b984691eefdfea8fddb38d11e585&pid=701347&user=gopalsays108
class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for(int i = 0 ; i < N ; i++){
            String str = queue.poll();
            ans.add(str);
            queue.offer(str+ '0');
            queue.offer(str+ '1');
        }
        return ans;
    }
    
}
