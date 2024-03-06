package advance;

import java.util.HashMap;
import java.util.List;

public class CountPaths {
    public static int countPath(int row, int col, List<List<String>>grid, HashMap<List<Integer>,Integer> memo){
        if (row == grid.size() || col == grid.get(0).size()){
            return 0;
        }

        if (grid.get(row).get(col) == "x"){
            return 1;
        }

        List<Integer> pos = List.of(row,col);
        if (memo.containsKey(pos)){
            return memo.get(pos);
        }

        int ans =  countPath(row+1, col, grid, memo) + countPath(row, col+1, grid, memo);
        memo.put(pos,ans);
        return ans;
    }
}
