public class Q17_FarmersBasket {
    static boolean exists(int[] arr, int key, int i) {
        if (i == arr.length) return false;
        if (arr[i] == key) return true;
        return exists(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int key = 25;
        System.out.println(exists(arr, key, 0));
    }
}
