// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1571.NewRobot.subsystems;

import org.usfirst.frc1571.NewRobot.RobotMap;
import org.usfirst.frc1571.NewRobot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController speedController1 = RobotMap.driveSpeedController1;
    SpeedController speedController2 = RobotMap.driveSpeedController2;
    SpeedController speedController3 = RobotMap.driveSpeedController3;
    SpeedController speedController4 = RobotMap.driveSpeedController4;
    RobotDrive robotDrive41 = RobotMap.driveRobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void takeJoystickInputs(Joystick mainStick) {
    	robotDrive41.arcadeDrive(0.5, 0.5);
    }
    
    public void stop() {
    	robotDrive41.drive(0, 0);
    }
}	
