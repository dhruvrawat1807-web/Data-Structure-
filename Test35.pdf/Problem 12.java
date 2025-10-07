public class Q12_MagicalStaircase {
    static int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways: " + climbStairs(n));
    }
}
