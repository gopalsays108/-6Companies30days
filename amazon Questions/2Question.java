//link: https://leetcode.com/submissions/detail/615444615/

class Solution {
    public int longestMountain(int[] arr) {
        
        int res = 0;
        boolean up = false;
        boolean down = false;
        int i =0;
        
        if(arr.length < 3) return 0;
        
        while(i < arr.length - 1){
            
            if(arr[i] < arr[i+1]){
                int start = i;
                
                while(i < arr.length - 1 && arr[i] < arr[i+1]){
                    i++;
                    up = true;
                }
                
                while(i < arr.length - 1 && arr[i] > arr[i+1]){
                    down = true;
                    i++;
                }
                
                if(up == true && down  == true){
                    res = Math.max(res, i - start + 1);
                }
                
                up = down = false;
                
            }else{
                i++;                
            }
            
        }
        
        // System.out.println(longe);
        return res;
    }
}
