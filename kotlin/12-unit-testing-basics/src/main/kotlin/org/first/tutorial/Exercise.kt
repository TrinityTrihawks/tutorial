package org.first.tutorial

class Exercise {

    /**
     * Simple battery helper to test.
     */
    class BatteryMonitor(private val minVoltage: Double, private val maxVoltage: Double) {
        fun isCritical(voltage: Double): Boolean {
            return voltage <= minVoltage
        }

        fun isHealthy(voltage: Double): Boolean {
            return voltage >= maxVoltage
        }

        fun percentRemaining(voltage: Double): Double {
            val clamped = minOf(maxOf(voltage, minVoltage), maxVoltage)
            val range = maxVoltage - minVoltage
            val remaining = clamped - minVoltage
            return (remaining / range) * 100.0
        }
    }
}
