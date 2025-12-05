## Goal
Practice `for` and `while` loops by crunching sensor data.

## Background
- Loops repeat code over collections of data.
- `for` loops are great when you know how many items; `while` loops run until a condition changes.
- Arrays hold many values of the same type; you access items by index starting at 0.

## Steps
- Implement the following in `src/main/java/org/first/tutorial/Exercise.java`:
  - `int countObstacles(int[] distancesCm, int dangerThresholdCm)` — count readings at or below the threshold.
  - `double average(double[] values)` — compute the mean; return `0` for an empty array.
  - `int indexOfFirstBelow(int[] distancesCm, int dangerThresholdCm)` — return the index of the first dangerous reading, or `-1` if none.
- Use loops (no streams yet).
- Run `../gradlew :4-loops-and-iteration:test` until green.

## Tip
- Watch your off-by-one errors: check array bounds carefully.
