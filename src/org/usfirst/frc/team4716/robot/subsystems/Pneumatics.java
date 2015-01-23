package org.usfirst.frc.team4716.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private DoubleSolenoid valve;
	
	public Pneumatics(){
		valve = new DoubleSolenoid(0,1); 
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void valveOpen(){
        valve.set(DoubleSolenoid.Value.kForward);
    }
    
    public void valveClose(){
        valve.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void disableValvesOperation(){
        valve.set(DoubleSolenoid.Value.kOff);
    }
}

