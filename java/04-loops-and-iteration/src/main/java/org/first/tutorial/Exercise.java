package org.first.tutorial;

public class Exercise {

    /**
     * Counts how many obstacles are within the danger threshold.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Loop through the <code>distancesCm</code> array.
     * For each distance that is less than or equal to <code>dangerThresholdCm</code>, increment a counter.
     * Return the final count.
     * </p>
     *
     * <p>
     * <strong>Explanation:</strong>
     * A "for-each" loop is useful here:
     * <pre>
     * int count = 0;
     * for (int value : values) {
     *     if (value <= limit) {
     *         count = count + 1;
     *     }
     * }
     * return count;
     * </pre>
     * </p>
     */
    public int countObstacles(int[] distancesCm, int dangerThresholdCm) {
        return 0;
    }

    /**
     * Calculates the average (mean) of the values.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. If the array is empty (length is 0), return 0.0.
     * 2. Sum up all values in the array.
     * 3. Divide the sum by the number of elements (<code>values.length</code>).
     * </p>
     *
     * <p>
     * <strong>Tip:</strong>
     * You can check array length with <code>values.length</code>.
     * </p>
     */
    public double average(double[] values) {
        return 0.0;
    }

    /**
     * Finds the index of the first object within the danger threshold.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Loop through the array using a standard for-loop with an index <code>i</code>.
     * Return the <em>index</em> (0, 1, 2...) of the first distance that is <= <code>dangerThresholdCm</code>.
     * If no such distance is found, return -1.
     * </p>
     *
     * <p>
     * <strong>Explanation:</strong>
     * <pre>
     * for (int i = 0; i < array.length; i++) {
     *     if (array[i] == target) {
     *         return i; // Return immediately when found
     *     }
     * }
     * return -1; // If loop finishes without returning, it's not found
     * </pre>
     * </p>
     */
    public int indexOfFirstBelow(int[] distancesCm, int dangerThresholdCm) {
        return -2;
    }
}