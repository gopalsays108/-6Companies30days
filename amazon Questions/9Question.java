//https://practice.geeksforgeeks.org/viewSol.php?subId=eaecc0dfd7a006e27e17cfccb53733dc&pid=705293&user=gopalsays108
class Solution{
    static int isValid(int mat[][]){
        // code here
        HashSet<String> seen = new HashSet<>();

        for(int i =0; i< 9;i++){
         
         for(int j =0; j< 9;j++){
                int curr = mat[i][j]; 
                if(curr != 0 ){
                    if(!seen.add(String.valueOf(curr) + " found in row " + String.valueOf(i)) ||
                        !seen.add(String.valueOf(curr) + " found in columns " + String.valueOf(j)) ||
                        !seen.add(String.valueOf(curr) + " found in sub box " 
                        + String.valueOf(i/3) + "-" + String.valueOf(j/3))) return 0; 
                      
                }
          } 
          
        }
        
        return 1;
    }
}
