package org.first.tutorial;

public class Exercise {

    /**
     * Decides the robot's action based on distance and battery.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Implement the following logic:
     * <ul>
     *   <li>If <code>batteryVoltage</code> is below 11.0, return "STOP_BATTERY_LOW".</li>
     *   <li>Otherwise, if <code>distanceMeters</code> is less than 0.5, return "STOP_OBSTACLE".</li>
     *   <li>Otherwise, return "DRIVE_FORWARD".</li>
     * </ul>
     * </p>
     *
     * <p>
     * <strong>Explanation:</strong>
     * Use <code>if</code>, <code>else if</code>, and <code>else</code> statements to check conditions in order.
     * The first condition that is true will execute its block.
     * <br>
     * <pre>
     * if (score > 10) {
     *     return "Win";
     * } else if (score < 5) {
     *     return "Lose";
     * } else {
     *     return "Draw";
     * }
     * </pre>
     * </p>
     */
    public String decideAction(double distanceMeters, double batteryVoltage) {
        return "";
    }

    /**
     * Checks if it is safe to drive.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Return <code>true</code> if the action is "DRIVE_FORWARD", otherwise return <code>false</code>.
     * </p>
     *
     * <p>
     * <strong>Tip:</strong>
     * You can call the <code>decideAction</code> method you wrote above to get the action string.
     * Then compare strings using <code>.equals()</code>.
     * <br>
     * <code>String action = decideAction(distanceMeters, batteryVoltage);</code>
     * <br>
     * <code>if (action.equals("Target")) { ... }</code>
     * </p>
     */
    public boolean isSafeToDrive(double distanceMeters, double batteryVoltage) {
        return false;
    }
}