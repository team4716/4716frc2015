package org.usfirst.frc.team4716.robot.subsystems;

import org.usfirst.frc.team4716.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    private SpeedController motor;
    
    public DriveTrain(){
    	//motor = new Victor(RobotMap.LEFT_DRIVE_CIM);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveMotor(double d){
    	motor.set(d);
    }
    
    public void arcadeStick(Joystick stick){
    	stick.getY();
    }
}

