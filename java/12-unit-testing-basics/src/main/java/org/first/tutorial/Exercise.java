package org.first.tutorial;

public class Exercise {

    /**
     * Simple battery helper to test.
     */
    public static class BatteryMonitor {
        private final double minVoltage;
        private final double maxVoltage;

        public BatteryMonitor(double minVoltage, double maxVoltage) {
            this.minVoltage = minVoltage;
            this.maxVoltage = maxVoltage;
        }

        public boolean isCritical(double voltage) {
            return voltage <= minVoltage;
        }

        public boolean isHealthy(double voltage) {
            return voltage >= maxVoltage;
        }

        public double percentRemaining(double voltage) {
            double clamped = Math.max(minVoltage, Math.min(voltage, maxVoltage));
            double range = maxVoltage - minVoltage;
            double remaining = clamped - minVoltage;
            return (remaining / range) * 100.0;
        }
    }
}
