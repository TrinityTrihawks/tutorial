## Goal
Tie concepts together by parsing and executing a mini command script.

## Background
- This combines many skills: parsing strings, using conditionals, loops, and tracking state across multiple commands.
- Designing small helper methods keeps the main execution loop readable.
- Logging what happened (returning a list of messages) is a common pattern for understanding program behavior.

## Steps
- Implement `CommandRunner` in `src/main/java/org/first/tutorial/Exercise.java` with:
  - Method `List<String> execute(List<String> commands)`:
    - Each command string is `"MOVE <meters>"`, `"TURN <degrees>"`, or `"WAIT <seconds>"`.
    - For `MOVE`, add to a running `distanceTraveled` total and record `"Moved <meters>m"`.
    - For `TURN`, record `"Turned <degrees>deg"`.
    - For `WAIT`, record `"Waited <seconds>s"`.
    - For unknown commands, record `"Unknown command: <raw>"`.
    - Return a list of all recorded strings in order.
  - Getter `double getDistanceTraveled()` to expose the total meters moved.
- Keep parsing simple: split on space, ignore extra whitespace, and treat missing numbers as zero.
- Run `../gradlew :17-capstone-mini-robot-command:test`.

## Tip
- Reuse helpers from earlier modules (parsing, loops) if you revisit your own solutions.
