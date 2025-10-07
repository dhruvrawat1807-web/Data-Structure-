public class Q26_MagicalScrolls {
    static int[] search(int[][] mat, int i, int j, int target) {
        if (i == mat.length) return new int[]{-1, -1};
        if (j == mat[0].length) return search(mat, i + 1, 0, target);
        if (mat[i][j] == target) return new int[]{i, j};
        return search(mat, i, j + 1, target);
    }

    public static void main(String[] args) {
        int[][] mat = {{10,20,30},{40,50,60},{70,80,90}};
        int[] res = search(mat, 0, 0, 60);
        System.out.println("(" + res[0] + "," + res[1] + ")");
    }
}
