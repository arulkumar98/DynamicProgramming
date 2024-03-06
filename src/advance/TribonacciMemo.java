package advance;

public class TribonacciMemo {
    public static void main(String[] args) {
        int n = 8;
        int[] dp = new int[n + 1];
        int ans = findFibonacci(n, dp);
        System.out.println(ans);

    }

    private static int findFibonacci(int n, int[] dp) {
        if (n == 1 || n == 0) {
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = findFibonacci(n - 1, dp) + findFibonacci(n - 2, dp)+findFibonacci(n-3,dp);
        dp[n] = ans;
        return ans;
    }
}
