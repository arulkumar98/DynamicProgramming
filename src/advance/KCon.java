package advance;

public class KCon {
    public static void main(String[] args) {
        int[] arr = {44, 5, -60, 22, -20, 5, -8, 7};
        System.out.println(maxSum(arr, 2));
    }

    private static int maxSum(int[] arr, int k) {
        if (k == 1) {
            return kandasu(arr, k);
        } else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            if (sum > 0) {
                return (k - 2) * sum + kandasu(arr, 2);
            } else {
                return kandasu(arr, 2);
            }
        }

    }

    private static int kandasu(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length * 3; i++) {
            currentSum += arr[i % arr.length];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
