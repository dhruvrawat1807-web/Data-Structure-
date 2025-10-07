public class Q23_Ceil {
    static int ceilValue(int[] arr, int key, int low, int high, int ans) {
        if (low > high) return ans;
        int mid = (low + high) / 2;
        if (arr[mid] >= key)
            return ceilValue(arr, key, low, mid - 1, arr[mid]);
        return ceilValue(arr, key, mid + 1, high, ans);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,6,8};
        System.out.println("Ceil: " + ceilValue(arr, 5, 0, arr.length - 1, -1));
    }
}
