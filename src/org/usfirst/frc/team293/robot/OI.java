/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team293.robot;

import org.usfirst.frc.team293.robot.commands.TankDriveReverse;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
///////////instantiate joysticks
		public static Joystick leftStick = new Joystick(0);
		public static Joystick rightStick=new Joystick(1);
		public static Joystick launchpad=new Joystick(2);
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
		JoystickButton[] left= {null,new JoystickButton(leftStick,1), 
				   new JoystickButton(leftStick,2), 
				   new JoystickButton(leftStick,3), 
				   new JoystickButton(leftStick,4), 
				   new JoystickButton(leftStick,5), 
				   new JoystickButton(leftStick,6), 
				   new JoystickButton(leftStick,7), 
				   new JoystickButton(leftStick,8), 
				   new JoystickButton(leftStick,9), 
				   new JoystickButton(leftStick,10),};

		JoystickButton[] right= {null,new JoystickButton(rightStick,1), 
				   new JoystickButton(rightStick,2), 
				   new JoystickButton(rightStick,3), 
				   new JoystickButton(rightStick,4), 
				   new JoystickButton(rightStick,5), 
				   new JoystickButton(rightStick,6), 
				   new JoystickButton(rightStick,7), 
				   new JoystickButton(rightStick,8), 
				   new JoystickButton(rightStick,9), 
				   new JoystickButton(rightStick,10),};
		
		JoystickButton switch1up=new JoystickButton(launchpad, 2);
		JoystickButton switch1dn=new JoystickButton(launchpad, 1);
		JoystickButton switch2up=new JoystickButton(launchpad, 4);
		JoystickButton switch2dn=new JoystickButton(launchpad, 3);
		JoystickButton switch3up=new JoystickButton(launchpad, 6);
		JoystickButton switch3dn=new JoystickButton(launchpad, 5);
		JoystickButton switch4up=new JoystickButton(launchpad, 8);
		JoystickButton switch4dn=new JoystickButton(launchpad, 7);
	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:
		
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
