package advance;

public class SubSequenceTab {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,8,7,9,1};
        sequence(arr);
    }

    private static int sequence(int[] arr) {
        int[] dp = new int[arr.length+1];
        dp[0] = 1;
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < i ; j++) {
                if (arr[j] > arr[i]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+1;
            ans  = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
