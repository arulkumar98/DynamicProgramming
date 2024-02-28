package advance;

public class LongestSubseqence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,8,7,9,1};
        System.out.println(sebSeqence(arr,0,-1,new int[arr.length+1][arr.length+1]));
    }
    public static int sebSeqence(int[] arr, int index, int preIndex, int[][] dp){
        if (index == arr.length){
            return 0;
        }

        if (preIndex != -1 && dp[index][preIndex] != 0){
            return dp[index][preIndex];
        }

        int f1 = sebSeqence(arr, index + 1, preIndex, dp);
        int f2 = 0;
        if (preIndex == -1 || arr[index] > arr[preIndex]){
            f2 = 1+ sebSeqence(arr, index+1, preIndex, dp);
        }

        int ans = Math.max(f1,f2);

        if (preIndex != -1){
            dp[index][preIndex] = ans;
        }

        return ans;
    }
}
