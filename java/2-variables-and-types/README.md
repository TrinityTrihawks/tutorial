## Goal
Practice basic Java types by modeling a simple robot status report.

## Background
- Variables store data you want to reuse. You declare a type (kind of data) and a name (label).
- Common types: `int` (whole numbers), `double` (decimals), `boolean` (`true`/`false`), `String` (text).
- Fields inside a class belong to every object of that class; methods can read and update them.

## Steps
- Open `src/main/java/org/first/tutorial/Exercise.java` and add fields and methods described below.
- Fields to add: `int wheelCount`, `double batteryVoltage`, `boolean enabled`, `String driverName`.
- Add a method `double inchesPerWheelRotation(double wheelDiameterInches)` that multiplies circumference by wheel count (assume no slippage).
- Add a method `String statusLine()` that returns something like `Driver Mia | wheels:4 | battery:12.5V | enabled:true`.
- Run `../gradlew :2-variables-and-types:test` and adjust until tests pass.

## Tips
- Choose sensible default values for the fields, then let tests guide the exact strings and math.
- Keep formatting stable (spaces and punctuation matter in the tests).
- In Java, you can build strings with `+` (e.g., `"wheels:" + wheelCount`) or `String.format` (e.g., `String.format("battery:%.1fV", batteryVoltage)`).
- Concatenate pieces in the order the test expects: `"Driver " + driverName + " | wheels:" + wheelCount + " | battery:" + batteryVoltage + "V | enabled:" + enabled`.
