package advance;

public class ClaimStairs2Memo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,5,2,7,1};
        System.out.println(findMinPath(arr,arr.length,new int[arr.length+1]));
    }

    private static int findMinPath(int[] arr,int index,int[] memo) {
       if (index == 1){
           return arr[0];
       }

       if (index == 2){
           return arr[0]+ arr[1];
       }

       if (memo[index] != 0){
           return memo[index];
       }

       int step1 = findMinPath(arr, index-1,memo);
       int step2 = findMinPath(arr, index-2,memo);
       memo[index] = Math.min(step1,step2) + arr[index-1];
       return memo[index];
    }
}
