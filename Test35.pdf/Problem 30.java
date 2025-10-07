public class Q30_MagicPortal {
    static boolean binarySearch2D(int[][] mat, int target, int rowLow, int rowHigh, int colLow, int colHigh) {
        if (rowLow > rowHigh || colLow > colHigh) return false;
        int midRow = (rowLow + rowHigh) / 2;
        int midCol = (colLow + colHigh) / 2;
        if (mat[midRow][midCol] == target) return true;
        if (mat[midRow][midCol] > target)
            return binarySearch2D(mat, target, rowLow, midRow - 1, colLow, colHigh) ||
                   binarySearch2D(mat, target, midRow, rowHigh, colLow, midCol - 1);
        else
            return binarySearch2D(mat, target, midRow + 1, rowHigh, colLow, colHigh) ||
                   binarySearch2D(mat, target, rowLow, midRow, midCol + 1, colHigh);
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,8},{3,6,10},{7,9,12}};
        boolean res = binarySearch2D(mat, 9, 0, 2, 0, 2);
        System.out.println(res ? "Activated" : "Failed");
    }
}
