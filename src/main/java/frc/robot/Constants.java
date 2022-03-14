// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Drivetrain Constants
    public static final class DriveConstants {
        
        // Motor ports location on CAN thingamabobber
        public static final int kLeftMotor1Port = 5;
        public static final int kLeftMotor2Port = 7;

        public static final int kRightMotor1Port = 6;
        public static final int kRightMotor2Port = 8;

    }

    public static final class SolenoidConstants {
        // Intake Dropdown
        public static final int kIntakePort = 1; 

        // Robot Lift
        public static final int kActuatorForwardPort = 3;
        public static final int kActuatorReversePort = 4;
    }

	public static final class IntakeConstants {
		public static final int kMotor1Port = 9;
	}

	public static final class ITConstants {
		public static final int kMotor1Port = 10;
		public static final int kMotor2Port = 11;
	}

    // Controller constants
    public static final class OIConstants {
        public static final int controller = 0;
    }
}
