package org.usfirst.frc.team4716.robot.commands;

import org.usfirst.frc.team4716.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive_Forward_Right extends Command {

    public Drive_Forward_Right() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.reset();
    }

    protected void execute() {
    	Robot.drivetrain.tankDrive(1.0, 0.0);
    }

    protected boolean isFinished() {
    	if(Robot.drivetrain.getHeading() >= 90)
    		return true;
    	else
    		return false;
    }

    protected void end() {
    	Robot.drivetrain.driveSet(0);
    }

    protected void interrupted() {
    	Robot.drivetrain.driveSet(0);;
    }
}
