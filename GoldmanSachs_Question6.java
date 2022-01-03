//Link: https://leetcode.com/submissions/detail/612251540/
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        String lhs = str1 + str2;
        String rhs = str2 + str1;
        
        if(str1.equals(str2)){
            return str1;
        }
            
        if(!lhs.equals(rhs)){
            return  "";
        }
        
        if(str1.length() > str2.length()){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }else{
           return gcdOfStrings(str2.substring(str1.length()), str1);
        }       
        
    }
}                   
