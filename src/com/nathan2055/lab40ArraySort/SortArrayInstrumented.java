package com.nathan2055.lab40ArraySort;

/********************************************************************
 * Class for sorting an array of Comparable objects from smallest to
 * largest.
 *
 ********************************************************************/
public class SortArrayInstrumented {

    private long comparisons, totalComparisons, minComparisons, maxComparisons;

    public SortArrayInstrumented() {
        comparisons = 0;
        totalComparisons = 0;
        minComparisons = Long.MAX_VALUE;
        maxComparisons = 0;
    }

    private void startStatistics() {
        comparisons = 0;
    }

    private void endStatistics() {
        totalComparisons = totalComparisons + comparisons;
        if (comparisons < minComparisons) {
            minComparisons = comparisons;
        }
        if (comparisons > maxComparisons) {
            maxComparisons = comparisons;
        }
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getTotalComparisons() {
        return totalComparisons;
    }

    public long getMinComparisons() {
        return minComparisons;
    }

    public long getMaxComparisons() {
        return maxComparisons;
    }

    /**************************************************************
     * ITERATIVE SELECTION SORT
     **************************************************************/

    /**
     * Sorts the first n objects in an array into ascending order.
     *
     * @param a An array of Comparable objects.
     * @param n An integer > 0.
     */
    public <T extends Comparable<? super T>>
    void selectionSort(T[] a, int n) {
        startStatistics();
        for (int index = 0; index < n - 1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);
            // Assertion: a[0] <= a[1] <= . . . <= a[index] <= all other a[unsorted]
        } // end for
        endStatistics();
    } // end selectionSort

    /**
     * Finds the index of the smallest value in an array a.
     *
     * @param a     An array of Comparable objects.
     * @param first An integer >= 0 and < a.length that is the index of the first
     *              array entry to consider.
     * @param last  An integer >= 0 and < a.length that is the index of the last
     *              array entry to consider.
     * @return The index of the smallest value among
     * a[first], a[first+1], . . . , a[last].
     */
    public <T extends Comparable<? super T>>
    int getIndexOfSmallest(T[] a, int first, int last) {
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            comparisons++;
            if (a[index].compareTo(min) < 0) {
                min = a[index];
                indexOfMin = index;
            } // end if
            // Assertion: min is the smallest of a[first] through a[index].
        } // end for
        return indexOfMin;
    } // end getIndexOfSmallest

    /**
     * Swaps the array entries a[i] and a[j].
     *
     * @param a An array of  objects.
     * @param i An integer >= 0 and < a.length.
     * @param j An integer >= 0 and < a.length.
     *          <p>
     *          Modified from Carrano to use generics.
     */
    private <T>
    void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } // end swap


}// end SortArray
