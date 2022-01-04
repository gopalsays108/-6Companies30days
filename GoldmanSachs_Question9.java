//Link :https://practice.geeksforgeeks.org/viewSol.php?subId=d7c7bd3e5a5f34599d57912298769978&pid=703607&user=gopalsays108
class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        
        Stack<Integer> st = new Stack<>();
        int num = 1;
        StringBuilder sb = new StringBuilder();
        
        for(int i  = 0; i < S.length();i++){
            char ch = S.charAt(i);
            
            if(ch == 'D'){
                st.push(num);
                num++;
            }else{
                st.push(num);
                num++;
                
                while(!st.empty()){
                    sb.append(st.pop());
                }
            }
        }
        
        st.push(num);
        while(!st.empty()){
           sb.append(st.pop());
        }
        
        return sb.toString();
        
    }
}
