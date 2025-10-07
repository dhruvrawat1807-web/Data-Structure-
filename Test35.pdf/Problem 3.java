public class Q3_PotionMixing {
    static void findTwoSum(int[] arr, int target, int i, int j) {
        if (i >= arr.length) return;
        if (j >= arr.length) {
            findTwoSum(arr, target, i + 1, i + 2);
            return;
        }
        if (arr[i] + arr[j] == target) {
            System.out.println("Indices: (" + i + ", " + j + ")");
            return;
        }
        findTwoSum(arr, target, i, j + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7};
        int target = 6;
        findTwoSum(arr, target, 0, 1);
    }
}
