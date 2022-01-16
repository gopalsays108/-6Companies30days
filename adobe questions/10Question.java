//Link: https://practice.geeksforgeeks.org/viewSol.php?subId=eb4310f58a572d5be2588d8cbe9621f3&pid=701290&user=gopalsays108
class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> hm = new HashMap<>();

        for(String str : arr){
            int count = hm.getOrDefault(str, 0) + 1;
            hm.put(str, count);
        }
        PriorityQueue<String> q = new PriorityQueue<>();
       
        Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator(); 
        int count = 0;
        String win = "";

        while(itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            
            String key = entry.getKey();
            int val = entry.getValue();
        
            if(val > count){
                count = val;
                win = key;
            }else if(val == count){
                if(key.compareTo(win) < 0) {
                    win = key;
                }
            }
        }
        
        String[] ans = new String[2];
        ans[0] = win;
        ans[1] = String.valueOf(count);

        return ans;
    }
}

