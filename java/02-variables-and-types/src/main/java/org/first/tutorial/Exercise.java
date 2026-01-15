package org.first.tutorial;

public class Exercise {

    // ----------------------------------------------------------------------------------
    // INSTRUCTION: Initialize these variables with valid default values.
    // ----------------------------------------------------------------------------------
    //
    // 1. wheelCount: Set to 4 (an integer).
    // 2. batteryVoltage: Set to 12.5 (a decimal number, or double).
    // 3. enabled: Set to true (a boolean, true or false).
    // 4. driverName: Set to "Default Driver" (a text String).
    //
    // EXAMPLES:
    // int myNumber = 10;
    // double myValue = 3.14;
    // boolean isReady = false;
    // String myText = "Hello";
    // ----------------------------------------------------------------------------------

    public int wheelCount;
    public double batteryVoltage;
    public boolean enabled;
    public String driverName;

    /**
     * Calculates the total distance traveled for one full rotation of all wheels.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Calculate the circumference of one wheel and multiply it by the number of wheels (wheelCount).
     * The formula for circumference is: <code>Math.PI * diameter</code>
     * </p>
     *
     * <p>
     * <strong>Example:</strong>
     * If <code>wheelDiameterInches</code> is 4.0 and <code>wheelCount</code> is 4:
     * Circumference = 3.14159... * 4.0 = ~12.566
     * Result = 12.566 * 4 = ~50.265
     * </p>
     */
    public double inchesPerWheelRotation(double wheelDiameterInches) {
        // TODO: Calculate and return the result.
        // Hint: Use the 'wheelCount' variable you defined above.
        // Hint: Use Math.PI for the value of pi.
        return 0.0;
    }

    /**
     * Returns a status report of the robot.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Return a string that combines the field values in this format:
     * "[driverName] reports [wheelCount] wheels, battery at [batteryVoltage]V, enabled: [enabled]"
     * </p>
     *
     * <p>
     * <strong>Example Output:</strong>
     * "Default Driver reports 4 wheels, battery at 12.5V, enabled: true"
     * </p>
     *
     * <p>
     * <strong>Explanation:</strong>
     * You can use string concatenation with '+' or 'String.format(...)'.
     * <br>
     * <code>"Name: " + name + ", Age: " + age</code>
     * </p>
     */
    public String statusLine() {
        return "";
    }
}