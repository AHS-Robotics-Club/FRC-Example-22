package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SolenoidConstants;

public class IntakeSolenoidSubsystem extends SubsystemBase {
    
    // Initialize solenoids
    private final Solenoid leftIntake = new Solenoid(PneumaticsModuleType.REVPH, SolenoidConstants.intakeLeftPort);
    private final Solenoid rightIntake = new Solenoid(PneumaticsModuleType.REVPH, SolenoidConstants.intakeRightPort);

    /**
     * Empty constructor to initialize the solenoid subsystem, not necessary
     */
    public IntakeSolenoidSubsystem() {

    }

    /**
     * Turns on the left solenoid for the intake.
     */
    public void dropLeftIntake() {
        leftIntake.set(true);
    }

    /**
     * Turns on the right solenoid for the intake.
     */
    public void dropRightIntake() {
        rightIntake.set(true);
    }

}
