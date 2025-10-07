public class Q18_SecretDoor {
    static int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key) return mid;
        if (arr[mid] > key)
            return binarySearch(arr, key, low, mid - 1);
        else
            return binarySearch(arr, key, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 7;
        System.out.println("Index: " + binarySearch(arr, key, 0, arr.length - 1));
    }
}
