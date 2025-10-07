public class Q9_MessengerPath {
    static boolean isPath(int[][] grid, int i, int j, boolean[][] vis) {
        int n = grid.length, m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 1 || vis[i][j]) return false;
        if (i == n - 1 && j == m - 1) return true;
        vis[i][j] = true;
        return isPath(grid, i + 1, j, vis) || isPath(grid, i, j + 1, vis)
            || isPath(grid, i - 1, j, vis) || isPath(grid, i, j - 1, vis);
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(isPath(grid, 0, 0, new boolean[3][3]));
    }
}
