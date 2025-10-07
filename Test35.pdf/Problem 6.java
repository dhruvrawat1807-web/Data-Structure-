public class Q6_TreasureIsland {
    static int rowSum(int[][] arr, int row, int col) {
        if (col < 0) return 0;
        return arr[row][col] + rowSum(arr, row, col - 1);
    }

    static int findMaxRow(int[][] arr, int r, int c, int i, int maxSum, int rowIndex) {
        if (i == r) return rowIndex;
        int sum = rowSum(arr, i, c - 1);
        if (sum > maxSum) {
            maxSum = sum;
            rowIndex = i;
        }
        return findMaxRow(arr, r, c, i + 1, maxSum, rowIndex);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int row = findMaxRow(arr, 3, 3, 0, 0, 0);
        System.out.println("Row with max sum: " + row);
    }
}
