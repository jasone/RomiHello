// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveArc extends CommandBase {
  private final double m_speed;
  private final double m_rotation;
  private final double m_distance;
  private final Drivetrain m_drive;

  public DriveArc(double speed, double rotation, double inches,
   Drivetrain drive) {
    m_speed = speed;
    m_rotation = rotation;
    m_distance = inches;
    m_drive = drive;
    addRequirements(drive);
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
    m_drive.arcadeDrive(0, 0);
    m_drive.resetEncoders();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    m_drive.arcadeDrive(m_speed, m_rotation);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return Math.abs(m_drive.getAverageDistanceInch()) >= m_distance;
  }
}
