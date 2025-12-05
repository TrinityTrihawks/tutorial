package org.first.tutorial;

public class Exercise {

    public static class SensorReadException extends Exception {
        public SensorReadException(String message) {
            super(message);
        }

        public SensorReadException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public double parseSensorReading(String raw) throws SensorReadException {
        // TODO: parse and validate the reading.
        return 0.0;
    }

    public double averageReadings(String[] rawReadings) throws SensorReadException {
        // TODO: average valid readings, skip invalid ones, throw if none are valid.
        return 0.0;
    }
}
