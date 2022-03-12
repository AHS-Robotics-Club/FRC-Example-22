package frc.robot.subsystems;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.Constants.SolenoidConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConst;
public class intake extends SubsytemBase{
    private final Solenoid leftIntake = new Solenoid(PneumaticsModuleType.REVPH, SolenoidConstants.intakeLeftPort);
    private final Solenoid rightIntake = new Solenoid(PneumaticsModuleType.REVPH, SolenoidConstants.intakeRightPort);
	private final CANSparkMax motor = new CANSparkMax(IntakeConst.IntakeMotor, MotorType.kBrushless);	
    /**
     * Empty constructor to initialize the solenoid subsystem, not necessary
     */
    public intake() {

    }
	public void run(){
		motor.set(0.75);
	}
	public void stop(){
		motor.set(0.0);
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
