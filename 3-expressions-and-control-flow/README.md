## Goal
Use boolean logic and if/else to pick a robot action based on sensor input.

## Background
- Booleans represent yes/no (`true`/`false`) facts, e.g., “obstacle too close?”
- `if/else` lets the program choose a path based on conditions.
- Comparison operators: `<`, `<=`, `>`, `>=`, `==`, `!=` combine with `&&` (and) and `||` (or) to make decisions.

## Scenario
You have a distance sensor and a battery monitor. Decide what to do next.

## Steps
- Implement `decideAction(double distanceMeters, double batteryVoltage)` in `src/main/java/org/first/tutorial/Exercise.java`.
- Logic rules (in order):  
  1. If distance is negative, treat it as bad data and return `"SENSOR_ERROR"`.  
  2. If an obstacle is closer than 0.5 m, return `"STOP"`.  
  3. Else if battery is below 11.0 V, return `"RETURN_TO_CHARGER"`.  
  4. Otherwise return `"DRIVE_FORWARD"`.
- Add a helper `boolean isSafeToDrive(double distanceMeters, double batteryVoltage)` that reuses your action logic (no duplicated conditions).
- Run `../gradlew :3-expressions-and-control-flow:test` and iterate.

## Tip
- Avoid magic numbers: consider keeping thresholds in constants so you can tweak them later.
