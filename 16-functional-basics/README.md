## Goal
Use lambdas and streams to crunch telemetry data.

## Background
- A lambda is a small anonymous function you can pass around, like `value -> value > 10`.
- Streams let you chain operations (filter, map, average) over collections without writing manual loops.
- Streams don’t change the original list unless you collect into a new one.

## Steps
- Implement in `src/main/java/org/first/tutorial/Exercise.java` using streams:
  - `List<Double> filterAbove(List<Double> readings, double minValue)` — keep values strictly greater than `minValue`.
  - `double average(List<Double> readings)` — return the average or `0` if empty.
  - `String summary(List<Double> readings)` — return `"count:<n> avg:<avg>"` using the average from above.
- Run `../gradlew :16-functional-basics:test`.

## Tip
- Practice `mapToDouble`, `average`, and `orElse` to handle empty streams.
