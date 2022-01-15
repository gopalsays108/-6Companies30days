///https://practice.geeksforgeeks.org/viewSol.php?subId=c2706e4b8dbab070a95235b3a8e0155b&pid=701236&user=gopalsays108
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int i = 0;
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int j  = 0;
        while(i < n ){
            sum += arr[i];
            
            if(sum == s){
                al.add(j + 1);
                al.add(i + 1);
                break;
            }
            
            if(sum > s){
                while(sum > s){
                    sum -= arr[j];
                    j++;
                    if(sum == s){
                        al.add(j + 1);
                        al.add(i + 1);
                        i = n;
                    }
                }
                
            }
            i++;
        }
        
        if(al.size() == 0) {
            al.add(-1);
            return al;
        }
        return al;
    }
}
