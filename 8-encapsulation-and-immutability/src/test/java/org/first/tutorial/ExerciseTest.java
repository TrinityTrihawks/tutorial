package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.first.tutorial.Exercise.ImmutablePose;
import org.first.tutorial.Exercise.RobotSettings;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void robotSettingsValidates() {
        RobotSettings settings = new RobotSettings("Photon", 3.5);
        assertEquals("Photon", settings.getRobotName());
        assertEquals(3.5, settings.getMaxSpeedMetersPerSec(), 0.0001);
        settings.setMaxSpeedMetersPerSec(4.0);
        assertEquals(4.0, settings.getMaxSpeedMetersPerSec(), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> settings.setMaxSpeedMetersPerSec(0));
    }

    @Test
    void immutablePoseReturnsNewInstance() {
        ImmutablePose pose = new ImmutablePose(1.0, 2.0, 90.0);
        ImmutablePose turned = pose.withHeading(180.0);
        assertEquals(1.0, pose.getX(), 0.0001);
        assertEquals(90.0, pose.getHeadingDegrees(), 0.0001);
        assertEquals(180.0, turned.getHeadingDegrees(), 0.0001);
    }
}
