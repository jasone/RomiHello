// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutonomousCircle extends SequentialCommandGroup {
  /** Creates a new AutonomousCircle. */
  public AutonomousCircle(Drivetrain drivetrain) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      //alongWith(
        new DriveArc(-0.5, 0.25, 100, drivetrain),
        new DriveArc(-0.5, -0.25, 100, drivetrain)
        //new DriveDistance(-0.5, 20, drivetrain),
        //new TurnDegrees(-0.5, 41, drivetrain)
      //
    );
  }
}
