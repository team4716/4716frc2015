package org.usfirst.frc.team4716.robot.commands;

import org.usfirst.frc.team4716.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveMotor extends Command {

    public MoveMotor() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.elevator);
    	setTimeout(2.5);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.elevator.moveElevCIM(0.6);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.moveElevCIM(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.elevator.moveElevCIM(0.0);
    }
}
