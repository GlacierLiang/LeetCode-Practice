class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] dirs = {0, 1, 0, -1, 0};
        List<Integer> ans = new ArrayList<>();
        for (int h = m * n, i = 0, j = 0, k = 0; h > 0; --h) {
            ans.add(matrix[i][j]);
            matrix[i][j] += 300;
            int x = i + dirs[k], y = j + dirs[k + 1];
            if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] > 100) {
                k = (k + 1) % 4;
            }
            i += dirs[k];
            j += dirs[k + 1];
        }
        return ans;
    }
    
}