package advance;

import java.util.HashMap;
import java.util.List;

public class MinChange {
    public static int minChange(int amount, List<Integer> list){
        return minChange(amount,list,new HashMap<>());
    }
    private static int minChange(int amount, List<Integer>list, HashMap<Integer,Integer>memo){
        if (amount == 0){
            return 0;
        }
        if (amount < 0 ){
            return -1;
        }
        if (memo.containsKey(amount)){
            return memo.get(amount);
        }
        int minCoins = -1;
        for (int num : list){
            int subAmount = amount - num;
            int subCoins = minChange(subAmount,list,memo);
            if (subCoins != -1){
                int numCoin = subCoins+1;
                if (numCoin < minCoins || minCoins ==-1){
                    minCoins = numCoin;
                }
            }
        }
        memo.put(amount,minCoins);
        return minCoins;
    }
}
