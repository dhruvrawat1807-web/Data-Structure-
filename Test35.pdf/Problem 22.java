public class Q22_UpperBound {
    static int upperBound(int[] arr, int key, int low, int high) {
        if (low > high) return arr.length;
        int mid = (low + high) / 2;
        if (arr[mid] > key)
            return Math.min(mid, upperBound(arr, key, low, mid - 1));
        return upperBound(arr, key, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,6,8};
        System.out.println("Upper Bound: " + upperBound(arr, 6, 0, arr.length - 1));
    }
}
