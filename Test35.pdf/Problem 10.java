public class Q10_RainwaterPond {
    static void dfs(int[][] grid, int i, int j) {
        int n = grid.length, m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) return;
        grid[i][j] = 0;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }

    static int countPonds(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) {
                    count++;
                    dfs(grid, i, j);
                }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,0,1},{0,1,0},{1,0,1}};
        System.out.println("Total ponds: " + countPonds(grid));
    }
}
