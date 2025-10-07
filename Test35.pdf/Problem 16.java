public class Q16_AncientScroll {
    static int search(int[] arr, int key, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return search(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int key = 7;
        System.out.println("Index: " + search(arr, key, 0));
    }
}
