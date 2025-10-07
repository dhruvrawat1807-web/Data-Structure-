public class Q21_LowerBound {
    static int lowerBound(int[] arr, int key, int low, int high) {
        if (low > high) return arr.length;
        int mid = (low + high) / 2;
        if (arr[mid] >= key)
            return Math.min(mid, lowerBound(arr, key, low, mid - 1));
        return lowerBound(arr, key, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,6,8};
        System.out.println("Lower Bound: " + lowerBound(arr, 5, 0, arr.length - 1));
    }
}
