package cl.juan.playground.amazon.path.reduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReduceNto1 {


    static int getMinStepsto1(int n){
        if (n == 1) {
            return 0;
        }
        int result  = getMinStepsto1(n-1);
        result = (n % 2 == 0)? Math.min(result, getMinStepsto1(n / 2)) : result ;
        result = (n % 3 == 0)? Math.min(result, getMinStepsto1(n / 3)) : result ;
        return result  + 1;
    }

    static int getMinStepsto1Memo(int n, int[] memo){
        if (n == 1) {
            return 0;
        }
        if (memo[n] != 0){
            return memo[n];
        }
        int result  = getMinStepsto1Memo(n-1, memo);
        result = (n % 2 == 0)? Math.min(result, getMinStepsto1Memo(n / 2, memo)) : result ;
        result = (n % 3 == 0)? Math.min(result, getMinStepsto1Memo(n / 3, memo)) : result ;
        memo[n] = result  + 1;
        return memo[n];
    }

    static int getMinStepsto1Tabulation(int n){
        int[] table = new int[n+1];
        Arrays.fill(table,Integer.MAX_VALUE);
        table[1] = 0 ;
        for (int i = 1; i<n ; i++){
            // Addition
            if (isInTable(n,i +1) && ((table[i]+1 < table[i+1]) )) {
                table[i+1]=table[i]+1;
            }
            // Multiply by 2
            if (isInTable(n,i*2) && ((table[i]+1) < table[i*2] )) {
                table[i*2]=table[i]+1;
            }
            // Multiply by 3
            if (isInTable(n,i*3) && ((table[i]+1) < table[i*3] )) {
                table[i*3]=table[i]+1;
            }
        }
        return table[n];
    }

    static int getMinStepsto1TabulationArrayList(int n){
        List<Integer> table = new ArrayList<>(Collections.nCopies(n+1, Integer.MAX_VALUE));
        //declaring list and filling it with numbers
        table.set(1,0);
        for (int i = 1; i<n ; i++){
            // Addition
            if (isInTable(n,i +1) && ((table.get(i)+1 < table.get(i+1)) )) {
                table.set(i+1,table.get(i)+1);
            }
            // Multiply by 2
            if (isInTable(n,i*2) && ((table.get(i)+1) < table.get(i*2) )) {
                table.set(i*2, table.get(i)+1);
            }
            // Multiply by 3
            if (isInTable(n,i*3) && ((table.get(i)+1) < table.get(i*3) )) {
                table.set(i*3, table.get(i)+1);
            }
        }
        return table.get(n);
    }

    private static boolean isInTable(int n, int i) {
        return i< n+1;
    }
}
