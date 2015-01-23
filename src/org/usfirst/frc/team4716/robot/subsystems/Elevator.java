package org.usfirst.frc.team4716.robot.subsystems;

import org.usfirst.frc.team4716.robot.RobotMap;
import org.usfirst.frc.team4716.robot.commands.StopElevator;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem {
    
    private SpeedController elevCIM;
    private Encoder elevEncoder;
    
    public Elevator(){
    	double INCHES_PER_REV = (3.14159 * 4.0);
    	elevCIM = new Victor(RobotMap.LEFT_DRIVE_CIM);
    	LiveWindow.addActuator("DriveTrain", "Front Left CIM", (Victor) elevCIM);
    	
    	
    	elevEncoder = new Encoder(0, 1, false, EncodingType.k4X);
    	elevEncoder.setDistancePerPulse(1.0);
    	
    	
    }

    public void initDefaultCommand() {
        setDefaultCommand(new StopElevator());
    }
    
    public void encoderInchesPerRev(double distance){
        double inches = (distance * 12);
        double inchesPerRev = (inches / RobotMap.INCHES_PER_REV);
    }
    
    public void moveElevCIMUpInInches(double speed, double inches){
    	elevCIM.set(speed);
    	if (elevEncoder.getDistance() <= 100.0){
    		elevCIM.set(0.0);
    	}else{
    		elevCIM.set(speed);
    	}
    	
    }
    //public void moveElevCIMUntil(double speed,)
    public double getEncoderDistance(){
    	return elevEncoder.getDistance();
    }
    public void moveElevCIM(double speed){
    	elevCIM.set(speed);
    }
    public void encoderStart(){
    }
    public void encoderStop(){
    	
    }
    public void encoderReset(){
    	elevEncoder.reset();
    }
    public void smartDashLog(){
    	SmartDashboard.putNumber("Elevator Encoder", elevEncoder.getDistance());
    	SmartDashboard.putNumber("Elevator Encoder Count ", elevEncoder.get());
    	SmartDashboard.putNumber("Elevator Encoder Rate", elevEncoder.getRate());
    	SmartDashboard.putNumber("Elevator Encoder Raw", elevEncoder.getRaw());
    	SmartDashboard.putNumber("Elevator Encoder Pid?", elevEncoder.pidGet());
    	SmartDashboard.putString(" Hello", "You suck");
    }
}

