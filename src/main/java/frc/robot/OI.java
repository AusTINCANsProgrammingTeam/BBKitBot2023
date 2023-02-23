    /*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick controller = new Joystick(0);
  public JoystickButton buttonOne = new JoystickButton(controller, 1);  
  public JoystickButton buttonTwo = new JoystickButton(controller, 2);  
  public JoystickButton buttonThree = new JoystickButton(controller, 3);  
  public JoystickButton buttonFour = new JoystickButton(controller, 4);
  public JoystickButton buttonFive = new JoystickButton(controller, 5);
  public JoystickButton buttonSix = new JoystickButton(controller, 6);

  public final static int joystick = 0;
}