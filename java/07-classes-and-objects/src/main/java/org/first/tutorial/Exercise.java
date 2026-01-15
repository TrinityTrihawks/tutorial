package org.first.tutorial;

public class Exercise {

    // You can move Robot to its own file if you prefer, but keeping it here is fine for the exercise.
    public static class Robot {

        // INSTRUCTION: Define private fields.
        // 1. String name;
        // 2. double batteryVoltage;
        // 3. int tasksCompleted; (Initialize to 0)

        // TODO: Define the fields here.

        /**
         * Constructor to initialize the robot.
         *
         * <p>
         * <strong>Instruction:</strong>
         * Set the class fields <code>this.name</code> and <code>this.batteryVoltage</code>
         * using the values passed into the constructor.
         * </p>
         */
        public Robot(String name, double batteryVoltage) {
            // TODO: Assign fields.
        }

        /**
         * Simulates completing a task.
         *
         * <p>
         * <strong>Instruction:</strong>
         * 1. Decrease <code>batteryVoltage</code> by 0.5.
         * 2. Increment <code>tasksCompleted</code> by 1.
         * </p>
         */
        public void completeTask() {
            // TODO: Update state.
        }

        /**
         * Returns a summary of the robot's state.
         *
         * <p>
         * <strong>Instruction:</strong>
         * Return a string in the format:
         * "[name] (Battery: [batteryVoltage]V) - Completed: [tasksCompleted]"
         * </p>
         */
        public String summary() {
            return "";
        }
    }
}