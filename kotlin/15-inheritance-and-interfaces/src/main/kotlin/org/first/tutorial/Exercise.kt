package org.first.tutorial

open class Exercise {

    interface Drivebase {
        fun drive(forward: Double, turn: Double): String
    }

    class TankDrive : Exercise(), Drivebase {
        // TODO: implement drive with clamped left/right speeds.
        override fun drive(forward: Double, turn: Double): String {
            return ""
        }
    }

    class MecanumDrive : Exercise(), Drivebase {
        // TODO: implement drive with clamped wheel speeds.
        override fun drive(forward: Double, turn: Double): String {
            return ""
        }
    }

    // Optional: helper to clamp values between -1 and 1.
    protected fun clamp(value: Double): Double {
        return value
    }
}
