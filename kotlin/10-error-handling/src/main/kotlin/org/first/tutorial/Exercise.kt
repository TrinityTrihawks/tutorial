package org.first.tutorial

class Exercise {

    class SensorReadException : Exception {
        constructor(message: String) : super(message)
        constructor(message: String, cause: Throwable) : super(message, cause)
    }

    @Throws(SensorReadException::class)
    fun parseSensorReading(raw: String?): Double {
        // TODO: parse and validate the reading.
        return 0.0
    }

    @Throws(SensorReadException::class)
    fun averageReadings(rawReadings: Array<String>): Double {
        // TODO: average valid readings, skip invalid ones, throw if none are valid.
        return 0.0
    }
}
