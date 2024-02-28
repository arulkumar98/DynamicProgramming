package advance;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {44,5,-60,22,-20,5,-8,7};
        System.out.println(maxSubSet(arr));
    }

    private static int maxSubSet(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        for (int j : arr) {
            currentSum += j;
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
