//Submission Link: https://practice.geeksforgeeks.org/viewSol.php?subId=9dd4e55676b91b4ef7f31740a72e8913&pid=705474&user=gopalsays108

class Solution {
  public:
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here
        
        if(R1[1]>L2[1]||R2[1]>L1[1]) return 0;
        
        if(L2[0] > R1[0] || L1[0] > R2[0]) return 0;
        
        return 1;
    }
};
