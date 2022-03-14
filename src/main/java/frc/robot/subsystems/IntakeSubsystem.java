package frc.robot.subsystems;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.Constants.SolenoidConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConst;

/**
 * Intake Subsystem
 * 
 * Subsystem to drop and run intake
 */
public class IntakeSubsystem extends SubsystemBase{

    private final Solenoid intakeSol = new Solenoid(PneumaticsModuleType.REVPH, SolenoidConstants.intakePort); // Solenoid to drop intake
	private final CANSparkMax motor = new CANSparkMax(IntakeConst.IntakeMotor, MotorType.kBrushless); // Motor which runs intake

    /**
     * Empty constructor to initialize the solenoid subsystem
     */
    public IntakeSubsystem() {

    }

	/**
	 * Run intake in forward direction, collects the balls
	 */
	public void intake(){
		motor.set(0.75);
	}

	/**
	 * Run intake in reverse direction, spits out the balls as a failsafe mechanism
	 */
	public void outtake(){
		motor.set(-0.75);
	}

    /**
     * Turns on solenoid to drop intake 
     */
	public void drop(){
		intakeSol.set(true);
	}
}
