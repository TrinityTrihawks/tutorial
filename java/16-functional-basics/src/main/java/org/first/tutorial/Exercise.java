package org.first.tutorial;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

    /**
     * Filters a list to keep only values above a minimum.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Use Java Streams:
     * 1. <code>readings.stream()</code>
     * 2. <code>.filter(v -> v > minValue)</code>
     * 3. <code>.collect(Collectors.toList())</code>
     * </p>
     */
    public List<Double> filterAbove(List<Double> readings, double minValue) {
        return List.of();
    }

    /**
     * Calculates the average of the readings.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Use Java Streams:
     * 1. <code>readings.stream()</code>
     * 2. <code>.mapToDouble(v -> v)</code>
     * 3. <code>.average()</code>
     * 4. <code>.orElse(0.0)</code> (to handle empty list)
     * </p>
     */
    public double average(List<Double> readings) {
        return 0.0;
    }

    /**
     * Returns a summary string.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Return formatted string "count:[n] avg:[avg]".
     * Use <code>readings.size()</code> for count.
     * Call your <code>average()</code> method for avg.
     * </p>
     */
    public String summary(List<Double> readings) {
        return "";
    }
}