## Goal
Handle checked exceptions when dealing with noisy sensor input.

## Background
- Errors happen (bad sensor data, missing files). Java uses exceptions to signal problems.
- “Checked” exceptions must be declared or handled with `try`/`catch`.
- Throwing an exception stops normal flow; catching lets you recover or skip bad data safely.

## Steps
- In `src/main/java/org/first/tutorial/Exercise.java`, add:
  - A checked exception class `SensorReadException` (extend `Exception`).
  - Method `double parseSensorReading(String raw)`:
    - Throw `SensorReadException` if `raw` is null/blank or cannot be parsed as a positive double.
    - Throw `SensorReadException` if the parsed value is negative.
  - Method `double averageReadings(String[] rawReadings)`:
    - Loop through `rawReadings`, parse each with `parseSensorReading`.
    - Skip invalid readings by catching `SensorReadException`.
    - If no valid readings remain, throw a `SensorReadException`.
    - Otherwise return the average of valid values.
- Run `../gradlew :10-error-handling:test`.

## Tip
- Keep the parsing logic in one place to avoid duplicating error checks.
