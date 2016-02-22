// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1571.NewRobot;

import org.usfirst.frc1571.NewRobot.commands.*;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton joystickButton1;
    public JoystickButton joystickButton2;
    public JoystickButton joystickButton3;
    //public JoystickButton joystickButton4;
    public JoystickButton joystickButton5;
    public Joystick mainStick;
    public static double mainStickRTrigger;
    public double mainStickRStickX;
    public double mainStickRStickY;
    
    //public double mainStickRightX;
    //public double mainStickRightX;
   // public double mainStickRightY;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        mainStick = new Joystick(0);
       
        mainStickRTrigger = mainStick.getRawAxis(3);
        mainStickRStickX = mainStick.getRawAxis(4);
        mainStickRStickY = mainStick.getRawAxis(5);
        
        joystickButton1 = new JoystickButton(mainStick, 1);
        joystickButton1.whileHeld(new armUp());
        joystickButton2 = new JoystickButton(mainStick, 3);
        joystickButton2.whileHeld(new armDown());
        
        joystickButton3 = new JoystickButton(mainStick, 6);
        joystickButton3.whileHeld(new auxRun());
        //joystickButton4 = new JoystickButton(mainStick, 4);
        //joystickButton5.toggleWhenPressed(new Reverse());
        
        //mainStickRightX = new double(mainStick.getRawAxis(4));
        
        joystickButton5 = new JoystickButton(mainStick, 5);
        joystickButton5.whileHeld(new runSucker());
	    
       


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    //public Joystick getMainStick() {
        //return mainStick;
    //}
    
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

