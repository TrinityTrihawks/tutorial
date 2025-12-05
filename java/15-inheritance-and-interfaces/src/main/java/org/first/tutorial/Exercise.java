package org.first.tutorial;

public class Exercise {

    public interface Drivebase {
        String drive(double forward, double turn);
    }

    public static class TankDrive implements Drivebase {
        // TODO: implement drive with clamped left/right speeds.
        @Override
        public String drive(double forward, double turn) {
            return "";
        }
    }

    public static class MecanumDrive implements Drivebase {
        // TODO: implement drive with clamped wheel speeds.
        @Override
        public String drive(double forward, double turn) {
            return "";
        }
    }

    // Optional: helper to clamp values between -1 and 1.
    protected double clamp(double value) {
        return value;
    }
}
