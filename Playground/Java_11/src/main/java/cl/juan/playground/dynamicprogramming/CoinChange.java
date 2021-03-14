package cl.juan.playground.dynamicprogramming;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        return solution(coins, amount);
    }

    private int solution(int[] coins, int amount) {
        //return bForceBacktrackingCoinChange(0, coins, amount);
        if (amount < 1){
            return 0;
        }
        return bottomUpDPCoinChange(coins, amount ,new int[amount]);
    }

    private int bForceBacktrackingCoinChange(int idxCoin, int[] coins, int amount) {
        if (amount == 0){
            return 0;
        }
        if ( idxCoin  < coins.length && amount > 0){
            int maxVal = amount / coins[idxCoin];
            int minCost = Integer.MAX_VALUE;
            for ( int x = 0; x<= maxVal; x++){
                int subAmount  = coins[idxCoin] * x;
                if (amount >= subAmount){
                    int subResult = bForceBacktrackingCoinChange(idxCoin + 1, coins, amount - subAmount);
                    if (subResult != -1){
                        minCost = Math.min(minCost, subResult + x);
                    }
                }
            }
            return (minCost == Integer.MAX_VALUE ? -1 : minCost);
        }
        return -1;
    }



    public int bottomUpDPCoinChange(int[] coins, int remainder, int[] count){
        if (remainder < 0) return -1;
        if (remainder == 0) return 0;
        if (count[remainder -1] != 0 ) return count[remainder-1];
        int min = Integer.MAX_VALUE;
        for (int coin : coins){
            int partialResult = bottomUpDPCoinChange(coins, remainder-coin, count);
            if (partialResult >= 0 && partialResult < min){
                min = 1 + partialResult;
            }
        }
        count[remainder-1] = (min == Integer.MAX_VALUE ? -1 : min);
        return count[remainder-1];

    }


}
