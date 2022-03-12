package frc.robot.subsystems;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.Constants.SolenoidConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConst;
public class IntakeSubsystem extends SubsystemBase{
    private final Solenoid intakeSol = new Solenoid(PneumaticsModuleType.REVPH, SolenoidConstants.intakePort);
	private final CANSparkMax motor = new CANSparkMax(IntakeConst.IntakeMotor, MotorType.kBrushless);	
    /**
     * Empty constructor to initialize the solenoid subsystem, not necessary
     */
    public IntakeSubsystem() {

    }
	public void run(){
		motor.set(0.75);
	}
    /**
     * Turns solenoid for the intake.
     */
	public void drop(){
		intakeSol.set(true);
	}
}
