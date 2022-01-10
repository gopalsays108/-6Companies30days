//https://practice.geeksforgeeks.org/viewSol.php?subId=39ed0b991ebc86fb5e0e1ff45c94f37f&pid=700021&user=gopalsays108
class Solution{
   static void linkdelete(Node head, int M, int N){
       int n=1,m=N;
       Node tem=head;
       while(tem!=null){
           if(n==M){
               Node p=tem;
               while(p!=null&&m-->0){
                   p=p.next;
               }
               if(p!=null)
               tem.next=p.next;
               else tem.next=p;
               n=0;
               m=N;
           }
           n++;
           tem=tem.next;
       }
   }
}


