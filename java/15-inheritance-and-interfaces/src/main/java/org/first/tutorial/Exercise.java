package org.first.tutorial;

public class Exercise {

    public interface Drivebase {
        String drive(double forward, double turn);
    }

    public static class TankDrive implements Drivebase {
        /**
         * Simulates Tank Drive.
         *
         * <p>
         * <strong>Instruction:</strong>
         * 1. Calculate left = forward + turn.
         * 2. Calculate right = forward - turn.
         * 3. Clamp both values between -1.0 and 1.0.
         * 4. Return string "Left: [l], Right: [r]".
         * </p>
         */
        @Override
        public String drive(double forward, double turn) {
            // TODO: Implement logic.
            return "";
        }
    }

    public static class MecanumDrive implements Drivebase {
        /**
         * Simulates Mecanum Drive (simplified).
         *
         * <p>
         * <strong>Instruction:</strong>
         * 1. For this exercise, assume all 4 wheels do (forward + turn).
         * 2. Calculate power = forward + turn.
         * 3. Clamp between -1.0 and 1.0.
         * 4. Return "FL: [p], FR: [p], BL: [p], BR: [p]".
         * </p>
         */
        @Override
        public String drive(double forward, double turn) {
            // TODO: Implement logic.
            return "";
        }
    }

    /**
     * Clamps a value between -1.0 and 1.0.
     *
     * <p>
     * <strong>Instruction:</strong>
     * If value > 1.0, return 1.0.
     * If value < -1.0, return -1.0.
     * Otherwise return value.
     * </p>
     */
    protected static double clamp(double value) {
        return Math.max(-1.0, Math.min(value, 1.0));
    }
}