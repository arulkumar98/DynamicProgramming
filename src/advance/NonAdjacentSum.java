package advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NonAdjacentSum {
    public static void main(String[] args) {
        List<Integer>list = List.of(4,8,12,18,71);
        System.out.println(sum(list,0,new HashMap<>()));
    }

    public static int sum(List<Integer> list, int index, HashMap<Integer, Integer> memo) {
        if (index >= list.size()) {
            return 0;
        }

        if (memo.containsKey(index)) {
            return index;
        }

        int ans = Math.max(list.get(index) +
                sum(list, index + 2, memo),
                sum(list, index + 1, memo));

        memo.put(index,ans);

        return ans;

    }
}
