public class Q27_BattleFormation {
    static boolean search(int[][] mat, int target, int low, int high, int cols) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        int i = mid / cols, j = mid % cols;
        if (mat[i][j] == target) return true;
        if (mat[i][j] > target)
            return search(mat, target, low, mid - 1, cols);
        return search(mat, target, mid + 1, high, cols);
    }

    public static void main(String[] args) {
        int[][] mat = {{1,3,5},{7,10,11},{16,20,30}};
        int rows = mat.length, cols = mat[0].length;
        System.out.println(search(mat, 10, 0, rows * cols - 1, cols));
    }
}
