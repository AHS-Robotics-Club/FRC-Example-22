package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ITConst;
public class ITSubsystem extends SubsystemBase{
	private final CANSparkMax motor1 = new CANSparkMax(ITConst.motor1,MotorType.kBrushless);
	private final CANSparkMax motor2 = new CANSparkMax(ITConst.motor2,MotorType.kBrushless);
	public ITSubsystem(){
		//empty
	}
	public void run(){
		motor1.set(0.5);
		motor2.set(0.5);
	}

}

