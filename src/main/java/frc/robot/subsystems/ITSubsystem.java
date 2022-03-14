package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ITConstants;

/**
 * Internal Transport Subsystem
 * 
 * Subsystem to run internal transport which moves balls from intake to shooter
 */

public class ITSubsystem extends SubsystemBase{

	// Initialize both motors which run subsystem 
	private final CANSparkMax motor1 = new CANSparkMax(ITConstants.kMotor1Port,MotorType.kBrushless);
	private final CANSparkMax motor2 = new CANSparkMax(ITConstants.kMotor2Port,MotorType.kBrushless);

    /**
     * Empty constructor to initialize the subsystem
     */
	public ITSubsystem(){

	}

	/**
	 * Runs the subsystem to move balls
	 */
	public void run(){
		motor1.set(0.5);
		motor2.set(0.5);
	}

}

