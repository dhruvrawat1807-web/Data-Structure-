public class Q8_RoyalDiagonal {
    static int primarySum(int[][] arr, int i, int n) {
        if (i == n) return 0;
        return arr[i][i] + primarySum(arr, i + 1, n);
    }

    static int secondarySum(int[][] arr, int i, int n) {
        if (i == n) return 0;
        return arr[i][n - i - 1] + secondarySum(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Primary: " + primarySum(arr, 0, 3));
        System.out.println("Secondary: " + secondarySum(arr, 0, 3));
    }
}
