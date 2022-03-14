package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SolenoidConstants;

/**
 * Robot Lift Subsystem
 * 
 * Subsystem that activates a solenoid in the forward drection to raise a hook,
 * which attaches to a rung of the hangar and then activates a solenoid in the reverse direction
 * to allow the robot to hang. 
 */

public class HangyThingySubsystem extends SubsystemBase {

     // Initialize Double Solenoid
     private final DoubleSolenoid actuator = new DoubleSolenoid(PneumaticsModuleType.REVPH,
        SolenoidConstants.kActuatorForwardPort, SolenoidConstants.kActuatorReversePort);

    /**
     * Empty constructor to initialize the subsystem
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
      * Open solenoid in reverse state
      */
     public void reverse() {
         actuator.set(Value.kReverse);
     }
}
