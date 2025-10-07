public class Q5_KingsParade {
    static boolean isSorted(int[] arr, int n) {
        if (n == 1) return true;
        if (arr[n - 2] > arr[n - 1]) return false;
        return isSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        System.out.println(isSorted(arr, arr.length));
    }
}
