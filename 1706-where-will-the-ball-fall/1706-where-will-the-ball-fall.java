class Solution {
    int m;
    int n;
    int[][] grid;
    
    public int[] findBall(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;
        int[] ans = new int[n];
        
        for(int i = 0; i < n ; i++)
            ans[i] = dfs(0,i);
        
        return ans;
    }
    
    public int dfs(int i, int j)
    {
        // reach end
        if(i == m)
            return j;
        
        // left block
        if(j == 0 && grid[i][j] == -1)
            return -1;
        
        // right block
        if(j == (n-1) && grid[i][j] == 1)
            return -1;
        
        // block in middle
        if(grid[i][j] == 1 && grid[i][j+1] == -1){
            return -1;
        }
        if(grid[i][j] == -1 && grid[i][j-1] == 1){
            return -1;
        }
           
        return grid[i][j] == 1 ? dfs(i + 1, j + 1) : dfs(i + 1, j - 1);
    }
}