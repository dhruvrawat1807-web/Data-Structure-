public class Q28_QueensJewels {
    static int[] search(int[][] mat, int i, int j, int target) {
        if (i == mat.length) return new int[]{-1, -1};
        if (j == mat[0].length) return search(mat, i + 1, 0, target);
        if (mat[i][j] == target) return new int[]{i, j};
        return search(mat, i, j + 1, target);
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,2},{3,4,4},{5,6,7}};
        int[] res = search(mat, 0, 0, 4);
        System.out.println("(" + res[0] + "," + res[1] + ")");
    }
}
