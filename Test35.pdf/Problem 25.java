public class Q25_TreasureMap {
    static boolean search(int[][] mat, int i, int j, int target) {
        if (i == mat.length) return false;
        if (j == mat[0].length) return search(mat, i + 1, 0, target);
        if (mat[i][j] == target) return true;
        return search(mat, i, j + 1, target);
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(search(mat, 0, 0, 5));
    }
}
