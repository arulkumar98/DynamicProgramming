package advance;

import java.util.HashMap;
import java.util.List;

public class SumPossible {
    public static boolean sumPossible(int amount, List<Integer> numbers){
        return sumPossible(amount,numbers,new HashMap<>());
    }
    private static boolean sumPossible(int amount, List<Integer>list,HashMap<Integer,Boolean>memo){
        if (amount == 0){
            return true;
        }
        if (amount < 0){
            return false;
        }
        if (memo.containsKey(amount)){
            return memo.get(amount);
        }

        for (int num : list){
            int sumAmount = amount - num;
            if (sumPossible(sumAmount,list,memo)){
                memo.put(sumAmount,true);
                return true;
            }
        }

        return false;
    }
}
