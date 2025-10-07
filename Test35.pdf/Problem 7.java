import java.util.*;

public class Q7_SpiralLibrary {
    static void spiral(int[][] mat, int top, int bottom, int left, int right, List<Integer> ans) {
        if (top > bottom || left > right) return;
        for (int i = left; i <= right; i++) ans.add(mat[top][i]);
        for (int i = top + 1; i <= bottom; i++) ans.add(mat[i][right]);
        if (top < bottom) for (int i = right - 1; i >= left; i--) ans.add(mat[bottom][i]);
        if (left < right) for (int i = bottom - 1; i > top; i--) ans.add(mat[i][left]);
        spiral(mat, top + 1, bottom - 1, left + 1, right - 1, ans);
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = new ArrayList<>();
        spiral(mat, 0, 2, 0, 2, ans);
        System.out.println(ans);
    }
}
