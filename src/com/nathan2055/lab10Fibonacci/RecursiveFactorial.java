package com.nathan2055.lab10Fibonacci;

public class RecursiveFactorial {

    /**
     * The basic recursive factorial.
     *
     * @param n The number to compute factorial of.
     * @return n factorial.
     */
    public long basic(long n) {
        long result = 1;
        if (n > 1)
            result = n * basic(n - 1);

        return result;
    }


    /**
     * The tail recursive version of factorial.
     *
     * @param n The number to compute factorial of.
     * @return n factorial.
     */
    public long tailRecursive(long n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result + helper(i, result);
        }
        return result;
    }

    /**
     * The tail recursive helper function for factorial.
     *
     * @param n       The number to compute factorial of.
     * @param partial The partial result that is being built up.
     * @return n factorial.
     */

    private long helper(long n, long partial) {
        long result = partial;
        if (n == 0) {
            result = partial;
        } if (n == 1) {
            result = partial;
        }else {
            result = partial * n;
        }
        return result;
    }


}
