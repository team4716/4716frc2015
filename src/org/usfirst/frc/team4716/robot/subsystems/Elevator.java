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
    
    //private double encodeCount;
    
    public Elevator(){
    	elevCIM = new Victor(RobotMap.ELEVATOR_CIM);
    	LiveWindow.addActuator("DriveTrain", "Front Left CIM", (Victor) elevCIM);
    	
    	
    	elevEncoder = new Encoder(RobotMap.ELEVATOR_ENCODER_PORT_1, RobotMap.ELEVATOR_ENCDER_PORT_2,
    							  false, EncodingType.k4X);
    	elevEncoder.setDistancePerPulse(1.0);
    	LiveWindow.addSensor("Encoder", "Elevator Encoder", elevEncoder);
    	
    	
    }

    public void initDefaultCommand() {
        setDefaultCommand(new StopElevator());
    }
    
    
    public void moveElevCIMUpInInches(double speed){
    	if (elevEncoder.getDistance() <= RobotMap.ELEV_DISTANCE){
    		elevCIM.set(0.0);
    	}else{
    		elevCIM.set(speed);
    	}
    	
    }
    
    
    public void moveElevCIMDownInInches(double speed, boolean quad){
    	if (quad == false){
    		if (elevEncoder.getDistance() <= RobotMap.ELEV_DISTANCE){
    			elevEncoder.reset();
    			if (elevEncoder.getDistance() <= RobotMap.ELEV_DISTANCE){
    				elevCIM.set(speed);
    			}
    		}
    	}else if (quad == true)	{
    		if (elevEncoder.getDistance() >= RobotMap.ELEV_DISTANCE){
    			if (elevEncoder.getDistance() == 0){
    				elevCIM.set(0.0);
    			}else{ elevCIM.set(speed);
    			}
    		}
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
    	SmartDashboard.putNumber("Elevator Encoder Raw", elevEncoder.getRaw());
    	SmartDashboard.putNumber("Elevator Encoder Number", elevEncoder.get());
    	SmartDashboard.putString(" Hello", "You suck");
    }
}

