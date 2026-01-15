package org.first.tutorial;

public class Exercise {

    /**
     * A custom exception for sensor errors.
     */
    public static class SensorReadException extends Exception {
        public SensorReadException(String message) {
            super(message);
        }

        public SensorReadException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /**
     * Parses a raw sensor reading (string) into a double.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Check if <code>raw</code> is null or empty. If so, throw a <code>SensorReadException</code> with a message "Empty input".
     * 2. Try to parse the string using <code>Double.parseDouble(raw)</code>.
     * 3. If parsing fails (catch <code>NumberFormatException</code>), throw a <code>SensorReadException</code> with the cause.
     * 4. Validate the range: If value < 0.0 or > 100.0, throw <code>SensorReadException</code> ("Out of range").
     * 5. Return the valid value.
     * </p>
     */
    public double parseSensorReading(String raw) throws SensorReadException {
        // TODO: Implement parsing and validation.
        return 0.0;
    }

    /**
     * Averages an array of raw readings.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Loop through the <code>rawReadings</code> array.
     * 2. For each string, try to call <code>parseSensorReading</code>.
     * 3. If it succeeds, add to a sum and increment a count.
     * 4. If it fails (catch <code>SensorReadException</code>), ignore that reading and continue to the next.
     * 5. Finally, if count is 0, throw a new <code>SensorReadException</code> ("No valid readings").
     * 6. Return sum / count.
     * </p>
     */
    public double averageReadings(String[] rawReadings) throws SensorReadException {
        // TODO: Calculate average of valid readings.
        return 0.0;
    }
}