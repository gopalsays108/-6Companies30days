/**
  
TC: O(n * n ) * 4
SC: O(n * n)
*/
class Solution {
    public int orangesRotting(int[][] grid) {
        
        if(grid == null || grid.length ==0) return 0;
        
        int row = grid.length;
        int cols = grid[0].length;
        
        Queue<int[]> qu = new LinkedList<>();
        int fresh = 0;
        
        for(int i = 0; i <row ;i++){
            for(int j = 0;j < cols;j++){
                if(grid[i][j] == 2){
                    qu.offer(new int[]{i,j});
                }
                
                if(grid[i][j] != 0){
                    fresh++;
                }
            }
        }
        
        if(fresh == 0) return 0;
        
        int countMin = 0, cnt = 0; //cnt to count orange
        
        //These are the coordinats to move
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        //bfs search from initially rotten egg
        while(!qu.isEmpty()){
            int size = qu.size();
            cnt += size;
            
            for(int i =0; i< size;i++){
                int[] point = qu.poll();
                for(int j = 0; j < 4; j++){
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];
                    
                    if( x < 0 || y < 0 || x >= row || y >= cols || grid[x][y] == 0 || grid[x][y] == 2 ) continue;
                    
                    grid[x][y] = 2;
                    qu.offer(new int[] {x, y});
                }
            }
            
            if(qu.size() != 0) countMin++;
            
        }
        
        return cnt == fresh? countMin : -1;
        
    }
}
