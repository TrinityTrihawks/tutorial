package org.first.tutorial;

public class Exercise {

    /**
     * Enum definitions for robot modes.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Define the following enum constants:
     * <ul>
     *   <li>AUTO</li>
     *   <li>TELEOP</li>
     *   <li>TEST</li>
     *   <li>DISABLED</li>
     * </ul>
     * </p>
     */
    public enum RobotMode {
        // TODO: Define constants here (comma separated, end with semicolon).
    }

    /**
     * returns a description for the mode.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Use a <code>switch</code> statement to return a description:
     * <ul>
     *   <li>AUTO: "Autonomous Mode"</li>
     *   <li>TELEOP: "Driver Control"</li>
     *   <li>TEST: "System Check"</li>
     *   <li>DISABLED: "Robot Safety Lock"</li>
     * </ul>
     * </p>
     *
     * <p>
     * <strong>Example:</strong>
     * <pre>
     * switch (mode) {
     *     case AUTO:
     *         return "Autonomous Mode";
     *     // ... other cases
     *     default:
     *         return "Unknown";
     * }
     * </pre>
     * </p>
     */
    public String describeMode(RobotMode mode) {
        return "";
    }

    /**
     * Parses a string to a RobotMode.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Convert the input string to uppercase (to handle "auto" vs "AUTO").
     * 2. Use <code>RobotMode.valueOf(string)</code> to convert it.
     * 3. Wrap it in a try-catch block to handle invalid strings.
     * 4. If invalid (IllegalArgumentException), return <code>RobotMode.DISABLED</code>.
     * </p>
     */
    public RobotMode fromString(String input) {
        // TODO: Implement parsing logic.
        return null;
    }
}