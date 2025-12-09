## Goal
Write reusable methods with parameters and return values.

## Background
- Methods are named blocks of code you can call; they can take inputs (parameters) and return outputs.
- Reusing smaller methods keeps code readable and avoids duplication.
- Math helpers like `Math.PI` are provided by Java to avoid hard-coding constants.

## Steps
- Implement in `src/main/java/org/first/tutorial/Exercise.java`:
  - `double wheelCircumference(double diameterInches)` — return `Math.PI * diameterInches`.
  - `double distanceForRotations(double wheelDiameterInches, int rotations)` — total inches traveled using circumference and rotation count.
  - `String formatMove(String direction, double meters)` — format like `MOVE FORWARD 2.5m` (direction uppercase, meters with `m` suffix).
- Avoid duplicating math: reuse the smaller methods where possible.
- Run `../gradlew :05-methods-and-parameters:test` until tests pass.

## Tip
- Validate inputs: if rotations is negative, treat distance as 0.
