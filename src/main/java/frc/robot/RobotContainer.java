// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.XboxController.Axis;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.AutoCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.HangyThingySubsystem;
import frc.robot.subsystems.ITSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem driveSubsystem = new DriveSubsystem(); // Adding a subsystem
  private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  private final HangyThingySubsystem hangyThingySubsystem = new HangyThingySubsystem();
  private final ITSubsystem it = new ITSubsystem();
  private final AutoCommand m_autoCommand = new AutoCommand(intakeSubsystem);
  private XboxController controller = new XboxController(OIConstants.controller); // Adding robot controller

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();


    // Set the default command for drive subsystem so that the robot will drive based on controller inputs throughout the match
    driveSubsystem.setDefaultCommand(
      new RunCommand(() -> driveSubsystem.drive(-controller.getLeftY(), controller.getRightX()), driveSubsystem));
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    //Intake right bumper
    new JoystickButton(controller, Button.kRightBumper.value)
      .whenPressed(new InstantCommand(intakeSubsystem::intake,intakeSubsystem));
    //Outtake left bumper
	  new JoystickButton(controller, Button.kLeftBumper.value)
      .whenPressed(new InstantCommand(intakeSubsystem::out,intakeSubsystem));
    //Internal Transport right trigger
	  new JoystickButton(controller, Axis.kRightTrigger.value)
      .whenPressed(new InstantCommand(it::run,it));
    //Lift thingy Y button
    new JoystickButton(controller, Button.kY.value)
      .toggleWhenPressed(new StartEndCommand(hangyThingySubsystem::forward, hangyThingySubsystem::deactivate, hangyThingySubsystem));

  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
