// https://practice.geeksforgeeks.org/viewSol.php?subId=25abf5a8717c0834c5133d84bfe847cb&pid=700386&user=gopalsays108
/*You are required to complete this method */

  int atoi(String str) {
        int num = 0,flag=1;
        for(char ch : str.toCharArray()){
            if(ch == '-')
                flag = -1;
            else if(ch < '0' || ch > '9')
                return -1;
            else
                num = num*10 + ch - '0';
        }
        return num*flag;
    }

  /*  or  */


class Solution
{
    int atoi(String str) {
	   // Your code here
	   try{
	       return Integer.parseInt(str);
	   }catch(Exception e){
	       return -1;
	   }
    }
}
