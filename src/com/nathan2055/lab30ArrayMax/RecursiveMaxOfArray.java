package com.nathan2055.lab30ArrayMax;

import java.lang.reflect.Array;

/**
 * Use a double recursion to compute the maximum of an array of values.
 */
public class RecursiveMaxOfArray {


    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data An array of integers.
     * @param from The low index for searching for the maximum.
     * @param to   The high index for searching for the maximum.
     *             <p>
     *             preconditions: from <= to, from >=0, to<length, length>0
     * @return The maximum value in the array.
     */

    public int max(int data[], int from, int to) {
        // Verify array is not empty or null
        try {
            if (Array.getLength(data) <= 0) {
                throw new BadArgumentsForMaxException("Maximum calculation failed: array cannot be empty");
            }
        } catch (BadArgumentsForMaxException e) {
            throw e;
        } catch (NullPointerException e) {
            throw new BadArgumentsForMaxException("Maximum calculation failed: array is null");
        }

        // Verify both from and to are sane values
        if (from < 0 || to < 0) {
            throw new BadArgumentsForMaxException("Maximum calculation failed: both search area values must be positive");
        }
        if (from > to) {
            throw new BadArgumentsForMaxException("Maximum calculation failed: lower bound must be smaller than upper bound");
        }
        if (from > data.length || to > data.length) {
            throw new BadArgumentsForMaxException("Maximum calculation failed: search bounds must be within array");
        }

        // Calculate midpoint of given indexes
        int midpoint = ((from + to) / 2);

        // If only one item is given to check, return the item
        if (from == to) {
            return data[from];
        }

        // If exactly two items are given to check, return the larger item
        else if (to == (from + 1)) {
            if (data[from] > data[to]) {
                return data[from];
            } else if (data[from] < data[to]) {
                return data[to];
            }
        }

        // If more than two items are given to check, break the search areas in half and call the method recursively
        else {
            int compare1 = max(data, from, midpoint);
            int compare2 = max(data, (midpoint + 1), to);
            if (compare1 > compare2) {
                return compare1;
            } else if (compare1 < compare2) {
                return compare2;
            }
        }

        // Throw an exception if somehow none of the above gets triggered
        throw new BadArgumentsForMaxException("Maximum calculation failed: unknown error occurred");
    }
}
