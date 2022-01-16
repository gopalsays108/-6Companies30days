// https://practice.geeksforgeeks.org/viewSol.php?subId=3beaeb9cb91bfb6da1366bc9e587a701&pid=702907&user=gopalsays108
class Solution{
    public String amendSentence(String s){
        //code here
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        if(ch[0] >= 65 && ch[0] <= 90){
            sb.append((char) (ch[0] + ' '));
        }else{
            sb.append((char) (ch[0]));
        }
        
        for(int i = 1 ; i < s.length(); i++){
          
          if(ch[i] >= 65 && ch[i] <= 90){
            sb.append(" " + (char) (ch[i] + ' '));
          }else{
              sb.append((char) (ch[i]));
           } 
        }
        
       // System.out.println(ans);
        
        
        return sb.toString();
    }
}
