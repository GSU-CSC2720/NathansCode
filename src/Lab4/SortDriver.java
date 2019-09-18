package Lab4;

import java.util.Random;
import java.util.Scanner;

/**
 * A class for generating statistical information about the basis sort performance.
 */


public class SortDriver {


    public static void main(String args[]) {
        int arraySize;
        int trials;
        Integer data[];

        SortArrayInstrumented sai = new SortArrayInstrumented();

        System.out.println("What size arrays should be used?");
        arraySize = getInt("   It should be an integer value greater than or equal to 1.");

        System.out.println("How many trials should be run?");
        trials = getInt("   It should be an integer value greater than or equal to 1.");

        for (int i = 0; i < trials; i++) {
            // MODIFY THE FOLLOWING TO GET THE NUMBER OF TRIALS AND LOOP
            data = generateRandomArray(arraySize);

            //System.out.println("The array is: " + getString(data));
            sai.selectionSort(data, arraySize);
            //System.out.println("    comparison made: "+sai.getComparisons());


            //System.out.println("The sorted array is: " + getString(data));

            // ADD CODE TO REPORT THE NUMBER OF COMPARISONS
        }

        System.out.println(sai.getTotalComparisons() + " comparisons were made.");
        System.out.println(sai.getMinComparisons() + " is the smallest number of comparisons.");
        System.out.println(sai.getMaxComparisons() + " is the largest number of comparisons.");
        long avg = (sai.getTotalComparisons() / trials);
        System.out.println(avg + " is the average number of comparisons made.");


    }


    /**
     * Generate an array of random integer values.  The values will be between 0 and size.
     *
     * @param size The size of the array to generate.
     * @return The array of integers.
     */
    private static Integer[] generateRandomArray(int size) {
        Integer result[] = new Integer[size];
        Random generator = new Random();

        for (int i = 0; i < size; i++) {
            int value = generator.nextInt(size);
            result[i] = value;
        }

        return result;
    }


    /**
     * A displayable representation of an array of Objects where toString is
     * applied on each object in the array
     *
     * @param data The array to display.
     * @return A printable string.
     */
    private static String getString(Object[] data) {
        String result = new String("[ ");

        for (int i = 0; i < data.length; i++) {
            result = result + data[i].toString() + " ";
        }

        result = result + "]";

        return result;
    }


    /**
     * Get an integer value
     *
     * @return An integer.
     */
    private static int getInt(String rangePrompt) {
        Scanner input;
        int result = 10;        //default value is 10
        try {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();

        } catch (NumberFormatException e) {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        } catch (Exception e) {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;

    }
}
