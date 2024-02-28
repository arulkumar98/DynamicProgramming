package advance;

public class LongestCommonSubSquenceMemo {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abdc";
        System.out.println(subSequence(s1, s2, 0, 0, new int[s1.length()][s2.length()]));
    }

    private static int subSequence(String s1, String s2, int index1, int index2, int[][] dp) {
        if (index1 == s1.length() || index2 == s2.length()) {
            return 0;
        }
        if (dp[index1][index2] != 0){
            return dp[index1][index2];
        }
        int ans;
        if (s1.charAt(index1) == s2.charAt(index2)) {
            ans = 1 + subSequence(s1, s2, index1 + 1, index2 + 1, dp);
        } else {
            ans = Math.max(subSequence(s1, s2, index1 + 1, index2, dp), subSequence(s1, s2, index1, index2 + 1, dp));
        }
        dp[index1][index2] = ans;
        return ans;
    }
}
