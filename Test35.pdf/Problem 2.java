public class Q2_LostSoldier {
    static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        int n = 5;
        int totalSum = n * (n + 1) / 2;
        int arrSum = sumArray(arr, arr.length);
        System.out.println("Missing soldier: " + (totalSum - arrSum));
    }
}
