//Linkg: https://practice.geeksforgeeks.org/viewSol.php?subId=fd1e0af7422c1e8925486ae2da0f3165&pid=707042&user=gopalsays108

class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code 
        
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        
        st.push(n-1);
        nge[n-1] = n;
        
        for(int i = n- 2; i>=0; i--){
            
            while(st.size() >0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            
            if(st.size() == 0) nge[i] = n;
            else nge[i] = st.peek();
            
            st.push(i);
        }
                   // System.out.print(arr.length + " " + n);

        int j = 0;
        for(int i = 0; i <n - k +1;i++ ){
            //enter the loop to find the maximum of window starting at i 
            if(j < i){
                j=i;
            }
            while(nge[j] < i+k){
                j = nge[j];
            }
            al.add(arr[j]);
        }
        
        return al;
    }
}

/*
int max = 0;
        ArrayList<Integer> arr2 =  new ArrayList<>();
        
        for(int i = 0; i< n - k +1; i++){
            
            for(int j = i; j < i+k; j++){
                max = Math.max(max, arr[j]);
            }
            arr2.add(max);
            max = 0;
            
        }
        

*/
