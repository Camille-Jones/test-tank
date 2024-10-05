// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Tankstuff;

public class DrivePls extends Command {
  /** Creates a new DrivePls. */
public Tankstuff tankstuff;
 public DoubleSupplier axis1;
 public DoubleSupplier axis2;

  public DrivePls(DoubleSupplier axis1, DoubleSupplier axis2, Tankstuff tankstuff) {
    this.axis1 = axis1;
    this.axis2 = axis2;
    this.tankstuff = tankstuff;

    addRequirements(tankstuff);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //tankstuff.FORWARD(RobotContainer.controller.getRawAxis(1), RobotContainer.controller.getRawAxis(5));
    double rightAxis = axis1.getAsDouble();
    double leftAxis = axis2.getAsDouble();
     tankstuff.FORWARD(rightAxis, leftAxis);
     //System.out.println("hi");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //tankstuff.FORWARD(0.0, 0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
