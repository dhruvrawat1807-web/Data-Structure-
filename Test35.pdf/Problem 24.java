public class Q24_Floor {
    static int floorValue(int[] arr, int key, int low, int high, int ans) {
        if (low > high) return ans;
        int mid = (low + high) / 2;
        if (arr[mid] <= key)
            return floorValue(arr, key, mid + 1, high, arr[mid]);
        return floorValue(arr, key, low, mid - 1, ans);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,6,8};
        System.out.println("Floor: " + floorValue(arr, 5, 0, arr.length - 1, -1));
    }
}
