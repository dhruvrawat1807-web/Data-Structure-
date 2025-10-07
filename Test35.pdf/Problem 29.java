public class Q29_HiddenScrolls {
    static boolean search(int[][] mat, int i, int j, int target) {
        if (i < 0 || j >= mat[0].length || i >= mat.length || j < 0) return false;
        if (mat[i][j] == target) return true;
        if (mat[i][j] > target)
            return search(mat, i - 1, j, target);
        return search(mat, i, j + 1, target);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16},
            {10,13,14,17}
        };
        System.out.println(search(mat, mat.length - 1, 0, 6));
    }
}
