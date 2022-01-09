//Link: https://practice.geeksforgeeks.org/viewSol.php?subId=f9ce3f5adfb4b8f5c1f38b04a629861c&pid=702959&user=gopalsays108
class Solution
{
    String colName (long n)
     {
        String temp="";
        while(n>0){
            char ch= (char) ( 'A' + (n-1)%26);
            temp=ch+temp;
            n=(n-1)/26;
        }
        return temp;
    }
}
