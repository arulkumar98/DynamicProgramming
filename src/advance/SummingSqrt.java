package advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SummingSqrt {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        int  n = 10;
        for (int i = 1; i*i <= n; i++) {
            list.addFirst(i*i);
        }

        System.out.println(list);
        System.out.println(Math.sqrt(n));
    }

    public static int summingSquares(int n) {
        List<Integer>list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            list.addFirst(i*i);
        }
        return summingSquares(n,list,new HashMap<>());
    }
    public static int summingSquares(int n , List<Integer> list, HashMap<Integer,Integer> memo){
        if (n ==  0){
            return 0;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int minSqrt = Integer.MAX_VALUE;
        for (int sqrt : list){
            int numSqrt = 1+ summingSquares(n-sqrt,list, memo);
            minSqrt = Math.min(minSqrt,numSqrt);
        }
        memo.put(n,minSqrt);
        return minSqrt;
    }

}
