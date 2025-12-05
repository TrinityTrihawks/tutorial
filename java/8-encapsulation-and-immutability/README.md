## Goal
Protect your data with encapsulation and practice building an immutable type.

## Background
- Encapsulation hides the internals of a class so only allowed methods can change state.
- Getters expose data safely; setters validate changes before applying them.
- Immutability means an object’s state never changes after creation; instead you make new copies with updates.

## Steps
- In `src/main/java/org/first/tutorial/Exercise.java`, add two classes:
  - `RobotSettings` (mutable, but encapsulated):
    - Private fields: `String robotName`, `double maxSpeedMetersPerSec`.
    - Constructor takes both fields.
    - Getter for each field.
    - Setter for max speed that rejects non-positive values with `IllegalArgumentException`.
    - `String summary()` returns `"Robot <name> max speed: <speed> m/s"`.
  - `ImmutablePose` (immutable):
    - Final fields `x`, `y`, and `headingDegrees`.
    - Constructor sets all three.
    - Getters for each field.
    - Method `ImmutablePose withHeading(double newHeading)` that returns a new instance, leaving the original unchanged.
- Run `../gradlew :8-encapsulation-and-immutability:test`.

## Tip
- Keep fields `private` and avoid exposing mutable internals.
