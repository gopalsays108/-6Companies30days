//https://practice.geeksforgeeks.org/viewSol.php?subId=c05123c6923be486d3bb11ce05ab4168&pid=701210&user=gopalsays108
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        
        for(int i = n - 1; i >= 0; i-- ){
            if(i == n-1){
                max = arr[i];
                al.add(0, arr[i]);
            }else{
                if(arr[i] >= max){
                    max = arr[i];
                    al.add(0, arr[i]);
                }
            }
        }
        // Collections.reverse(al);
        // System.out.println(al);
        return al;
    }
}
