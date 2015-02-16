package org.usfirst.frc.team4716.robot.commands;

import org.usfirst.frc.team4716.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive_Forward extends Command {

    public Drive_Forward() {
    	requires(Robot.drivetrain);
    	//setTimeout(4.0);
    }

    protected void initialize() {
    	Robot.drivetrain.reset();
    }

    protected void execute() {
    	Robot.drivetrain.tankDrive(-0.8, 0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drivetrain.tankDrive(0, 0);
    }

    protected void interrupted() {
    	Robot.drivetrain.tankDrive(0, 0);
    }
}
