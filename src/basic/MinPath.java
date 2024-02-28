package basic;

public class MinPath {
    public static void main(String[] args) {
        int[][] matrix = {{4,8,2},
                          {5,8,9},
                          {7,3,1}};
        int[][] memo = new int[matrix.length][matrix[0].length];
        System.out.println(findPath(matrix,0,0,memo));

    }

    private static int findPath(int[][] matrix,int i, int j, int[][] memo) {
        if (i >= matrix.length || j >= matrix[0].length){
            return Integer.MAX_VALUE;
        }

        if (i == matrix.length-1 && j == matrix[0].length-1){
            return matrix[i][j];
        }

        if (memo[i][j] != 0){
            return memo[i][j];
        }
        int right = findPath(matrix,i,j+1,memo);
        int left = findPath(matrix, i+1, j, memo);
        memo[i][j] = matrix[i][j] + Math.min(right,left);
        return matrix[i][j] + Math.max(right,left);
    }
}
