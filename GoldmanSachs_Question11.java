//https://practice.geeksforgeeks.org/viewSol.php?subId=3e65ba29953b093909697534728c7f7d&pid=702678&user=gopalsays108
class Solve {
   int[] findTwoElement(int arr[], int n) {
       // code here
       int i=0;
       int b[]=new int[n+1];
       int c[]=new int[2];
       while(i<=n-1){
           b[arr[i]]++;
           i++;
       }
       for(int j=1;j<=n; j++){
           if(b[j]==2)
             c[0]=j;
           if(b[j]==0)
            c[1]=j;
       }
       return c;
   }
}
