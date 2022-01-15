//lINK: https://practice.geeksforgeeks.org/viewSol.php?subId=c06d7b65da58eb56c9deacd45c381301&pid=702139&user=gopalsays108
// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        while(i < n){
            int j = i+1;
            while(j < n){
                int a = j+1, b = n-1;
                while(a < b){
                    int sum = arr[i]+arr[j]+arr[a]+arr[b];
                    if(sum == k){
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[a]);
                        al.add(arr[b]);
                        ans.add(al);
                        b--;
                        while(a+1 < b && arr[a+1] == arr[a])a++;
                        a++;
                    }else if(sum > k){
                        b--;
                    }else{
                        a++;
                    }
                }
                while(j+1 < n && arr[j] == arr[j+1])j++;
                j++;
            }
            while(i+1 < n && arr[i] == arr[i+1])i++;
            i++;
        }
        return ans;
    }
}
