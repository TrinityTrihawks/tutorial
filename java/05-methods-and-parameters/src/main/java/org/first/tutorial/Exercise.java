package org.first.tutorial;

public class Exercise {

    /**
     * Calculates the circumference of a wheel.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Return <code>Math.PI</code> multiplied by <code>diameterInches</code>.
     * </p>
     */
    public double wheelCircumference(double diameterInches) {
        return 0.0;
    }

    /**
     * Calculates distance for a number of rotations.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. If <code>rotations</code> is negative (< 0), return 0.0 (or handle it as 0 distance).
     * 2. Call your <code>wheelCircumference</code> method to get the circumference.
     * 3. Return circumference multiplied by <code>rotations</code>.
     * </p>
     *
     * <p>
     * <strong>Explanation:</strong>
     * Reusing methods helps keep code clean and avoids repeating formulas.
     * </p>
     */
    public double distanceForRotations(double wheelDiameterInches, int rotations) {
        return 0.0;
    }

    /**
     * Formats a movement command.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Convert <code>direction</code> to UPPERCASE (use <code>.toUpperCase()</code>).
     * 2. Append the <code>meters</code> value and "m".
     * </p>
     *
     * <p>
     * <strong>Example:</strong>
     * If direction is "forward" and meters is 2.5:
     * Return "FORWARD 2.5m"
     * </p>
     */
    public String formatMove(String direction, double meters) {
        return "";
    }
}