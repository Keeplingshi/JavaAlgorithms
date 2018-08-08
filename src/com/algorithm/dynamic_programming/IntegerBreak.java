package com.algorithm.dynamic_programming;

public class IntegerBreak {

    /**
     * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
     *
     * 例如，给定 n = 2，返回1（2 = 1 + 1）；给定 n = 10，返回36（10 = 3 + 3 + 4）。
     *
     * 注意：你可以假设 n 不小于2且不大于58。
     */

    public static void main(String[] args)
    {
        int n = 8;
        System.out.println(integerBreak(n));
    }

    private static int integerBreak(int n) {
        int array[] = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - j; j++) {
                array[i] = Math.max(Math.max(Math.max(array[j], j) * array[i - j], j * (i - j)), array[i]);
            }
        }

        return array[n];
    }

}
