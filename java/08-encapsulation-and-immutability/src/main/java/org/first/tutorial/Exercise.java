package org.first.tutorial;

public class Exercise {

    /**
     * A class representing robot settings with encapsulation.
     */
    public static class RobotSettings {
        // INSTRUCTION: Add private fields.
        // 1. private int maxSpeed;

        // INSTRUCTION: Add a constructor.
        // public RobotSettings(int maxSpeed) {
        //     // Use the setter to validate!
        //     setMaxSpeed(maxSpeed);
        // }

        // INSTRUCTION: Add a getter.
        // public int getMaxSpeed() { return maxSpeed; }

        // INSTRUCTION: Add a setter with validation.
        // public void setMaxSpeed(int maxSpeed) {
        //     if (maxSpeed < 0) this.maxSpeed = 0;
        //     else if (maxSpeed > 100) this.maxSpeed = 100;
        //     else this.maxSpeed = maxSpeed;
        // }
        
        // TODO: Implement the above structure.
    }

    /**
     * A class representing an immutable position.
     */
    public static class ImmutablePose {
        // INSTRUCTION: Add final fields.
        // public final double x;
        // public final double y;
        // public final double heading;

        // INSTRUCTION: Add a constructor to initialize all fields.

        // INSTRUCTION: Implement a 'Wither' method (returns a NEW instance).
        // public ImmutablePose withHeading(double newHeading) {
        //     return new ImmutablePose(this.x, this.y, newHeading);
        // }
        
        // TODO: Implement the above structure.
    }
}