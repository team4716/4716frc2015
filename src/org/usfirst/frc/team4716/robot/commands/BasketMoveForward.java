package org.usfirst.frc.team4716.robot.commands;

import org.usfirst.frc.team4716.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BasketMoveForward extends Command {

    public BasketMoveForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.pneumatics.valveOpen();
    	System.out.println("Valve Open");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pneumatics.disableValvesOperation();
    	System.out.println("Valve Disabled");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.pneumatics.disableValvesOperation();
    	System.out.println("Valve Disabled");
    }
}
