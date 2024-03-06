package advance;

import java.util.HashMap;
import java.util.List;

public class MaxPath {
    public static int maxPath
            (int row, int col, List<List<Integer>> grid, HashMap<List<Integer>, Integer> memo) {
        if (row == grid.size() || col == grid.get(0).size()) {
            return Integer.MAX_VALUE;
        }

        if (row == grid.size() - 1 || col == grid.get(0).size() - 1) {
            return grid.get(row).get(col);
        }

        List<Integer> pos = List.of(row, col);
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }


        int result = Math.max(
                maxPath(row + 1, col, grid, memo),
                maxPath(row, col + 1, grid, memo)) + grid.get(row).get(col);
        memo.put(pos, result);
        return result;
    }
}
