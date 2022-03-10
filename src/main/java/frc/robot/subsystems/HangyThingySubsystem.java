package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SolenoidConstants;

public class HangyThingySubsystem extends SubsystemBase {
     // Initialize Double Solenoid
     private final DoubleSolenoid actuator = new DoubleSolenoid(PneumaticsModuleType.REVPH, SolenoidConstants.actuatorForwardPort, SolenoidConstants.actuatorReversePort);

    /**
     * Empty constructor to initialize the subsystem, not necessary
     */
     public HangyThingySubsystem() {

     }

     /**
      * Open solenoid in forward state
      */
     public void forward() {
         actuator.set(Value.kForward);
     }

     /**
      * Close solenoid 
      */
     public void deactivate() {
         actuator.set(Value.kOff);
     }

     /**
      * Open solenoid in reverse state, not required
      */
     public void reverse() {
         actuator.set(Value.kReverse);
     }
}
