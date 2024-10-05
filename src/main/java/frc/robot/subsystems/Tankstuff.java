// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.sim.TalonFXSimState;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Tankstuff extends SubsystemBase {
  /** Creates a new Tankstuff. */

  public static final TalonFX RFmotor = new TalonFX(2);
  public static final TalonFX LFmotor = new TalonFX(3);
  public static final TalonFX RBmotor = new TalonFX(4);
  public static final TalonFX LBmotor = new TalonFX(5);

  TalonFXSimState RFSim = RFmotor.getSimState();
  TalonFXSimState LFSim = LFmotor.getSimState();
  TalonFXSimState RBSim = RFmotor.getSimState();
  TalonFXSimState LBSim = LFmotor.getSimState();

  public double speedR;
  public double speedL;

  
  public Tankstuff() {
     RBmotor.setControl(new Follower(2, false));
     LBmotor.setControl(new Follower(3, false));
  }


 public void FORWARD(Double speedR, Double speedL){

  speedR = this.speedR;
  speedL = this.speedL;

  RFmotor.set(speedR);
  LFmotor.set(speedL);

 }
 

  @Override
  public void periodic() {
  RFSim.setRotorVelocity(speedR);
  LFSim.setRotorVelocity(speedL);
  RBSim.setRotorVelocity(speedR);
  LBSim.setRotorVelocity(speedL);
}


}
