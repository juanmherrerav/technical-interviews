package cl.juan.playground.codility;


/*
*

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

    class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].

Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
* */


public class BynaryGap {

    public int solution(int N) {
        // write your code in Java SE 8
        int[] bynaryNumber=decimalToBinary(N);
        int biggestGap= traverseAndRecordGaps(bynaryNumber);
        return biggestGap;
    }

    public int traverseAndRecordGaps(int[] binaryNum ) {
        int biggestGap=0;
        int currentGap=0;
        for (int i = 0; i < binaryNum.length; i++) {
            if (binaryNum[i] == 0) {
                do {
                    currentGap++;
                    i++;
                } while (binaryNum[i] == 0 && i<binaryNum.length-1);
                if (gapCloses(i,binaryNum) && currentGap>biggestGap) {
                    biggestGap=currentGap;
                    currentGap =0;
                }
            }
        }
        return biggestGap;
    }

    private boolean gapCloses(int i, int[] binaryNum) {
        //TODO: check if i+1 exists and is different that zero
        if(i==binaryNum.length-1 ){
            return binaryNum[i]!=0;
        }else if(binaryNum[i+1]!=0 ){
            return true;
        }
        return true;
    }

    public int[] decimalToBinary(int n) {
        int i = binaryDigitsSize(n);
        int[] bynaryNumber = new int[i];
        int index=i-1;
        while (n > 0) {
            // storing remainder in binary array
            bynaryNumber[index] = n % 2;
            n = n / 2;
            index--;
        }
        return bynaryNumber;
    }

    public int binaryDigitsSize(int decimal){
        return (int)Math.floor(log2(decimal))+1;

    }

    private double log2(int decimal) {
        return Math.log(decimal) / Math.log(2);
    }
}
