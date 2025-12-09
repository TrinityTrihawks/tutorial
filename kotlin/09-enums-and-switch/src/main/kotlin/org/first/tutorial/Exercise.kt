package org.first.tutorial

class Exercise {

    enum class RobotMode {
        // TODO: add AUTO, TELEOP, TEST, DISABLED
    }

    fun describeMode(mode: RobotMode): String {
        // TODO: return a short description for each mode.
        return ""
    }

    fun fromString(input: String): RobotMode {
        // TODO: parse case-insensitive input and return DISABLED for unknown values.
        return RobotMode.DISABLED
    }
}
