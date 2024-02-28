package basic;

public class ClimbingStairsMemo {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return helper(n, dp);
    }

    private static int helper(int n, int[] dp) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = helper(n - 1, dp) + helper(n-2,dp);
        return dp[n];
    }
}
