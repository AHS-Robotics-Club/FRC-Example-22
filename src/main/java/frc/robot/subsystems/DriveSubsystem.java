package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {

    // Declaring Initializing Drivetrain Motor Groups
    private final MotorControllerGroup leftMotors = new MotorControllerGroup(
        new CANSparkMax(DriveConstants.kLeftMotor1Port, MotorType.kBrushless),
        new CANSparkMax(DriveConstants.kLeftMotor2Port, MotorType.kBrushless));

    private final MotorControllerGroup rightMotors = new MotorControllerGroup(
        new CANSparkMax(DriveConstants.kRightMotor1Port, MotorType.kBrushless),
        new CANSparkMax(DriveConstants.kRightMotor2Port, MotorType.kBrushless));

    
    // Declaring differential drivetrain using motor groups
    private final DifferentialDrive diffDrive = new DifferentialDrive(leftMotors, rightMotors);

    /**
     * Inverts right motors, as per WPILib convention.
     */
    public DriveSubsystem() {
        rightMotors.setInverted(true);
    }

    /**
     * Allows the robot to drive using arcade drive based upon input parameters 
     * 
     * @param xSpeed The forward and backward speed of robot
     * @param rotation The turning input for the robot 
     */

    public void drive(double xSpeed, double rotation) {
        diffDrive.arcadeDrive(xSpeed, rotation, true); 
    }
        
}
