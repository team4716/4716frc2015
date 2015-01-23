package org.usfirst.frc.team4716.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// ***** OBJECTS ***** //
	//public static SpeedController frontLeftCIM;
	//public static SpeedController frontRightCIM;
	/*public static SpeedController elevCIM;
	
	public static Gyro gyro;
	
	public static Encoder leftDriveEncoder;
	public static Encoder rightDriveEncoder;
	public static Encoder elevEncoder;
	
	public static Relay lightRelay;
	
	public static Solenoid leftElev;
	public static Solenoid rightElev;*/
	
	
	
	// ***** CONSTANTS ***** //
	
	// PID
    public static final double DRIVETRAIN_KP = 10.0;
    public static final double DRIVETRAIN_KI = 0.01;
    public static final double DRIVETRAIN_KD = 0.00;
    
    //Drive Constants
    public static double SENSITIVITY = 0.80;
    //public static double leftPower = Utils.rampSpeed(SENSITIVITY / 1.0);
    //public static double rightPower = Utils.rampSpeed(SENSITIVITY / 1.0);
    
    // gyro
    public static final int DRIVEBASE_GYRO_CHANNEL = 2;
    public static final double DRIVEBASE_GYRO_SENSITIVITY = .007;   
    
 // Camera Stuff
    public static final String CAMERA_ADDRESS = "10.47.16.11";
    public static final int CAMERA_BRIGHTNESS = 15;
    public static final int CAMERA_COMPRESSION = 0;
    public static final int CAMERA_COLOR_LEVEL = 100;
    public static final int TARGETING_LIGHT_RELAY_CHANNEL = 5;
    
    
    // Targeting and Camera Thingamajigs
    public static final int Y_IMAGE_RES = 480;
    public static final double VIEW_ANGLE = 49.0;
    public static final double PI = 3.141592653;
    public static final int RECTANGULARITY_LIMIT = 40;
    public static final int ASPECT_RATIO_LIMIT = 55;
    public static final int TAPE_WIDTH_LIMIT = 50;
    public static final int VERTICAL_SCORE_LIMIT = 50;
    public static final int LR_SCORE_LIMIT = 50;
    public static final int AREA_MINIMUM = 150;
    public static final int MAX_PARTICLES = 8;
    
    //Autonomous Constants
    
    public static final double WHEEL_DIAMETER = 6;
    public static final double INCHES_PER_REV = (PI * WHEEL_DIAMETER);//18.849555918 
    
    public static double DISTANCE_FEET = 10;
    public static double DISTANCE_INCHES = 18.84;
    
    //Compressor
    public static final int COMPRESSOR_RELAY_CHANNEL = 1;
    public static final int PRESSURE_SWITCH_DIO_CHANNEL = 1;
	
	/* Motors */
    public static int LEFT_DRIVE_CIM = 0,
    				  RIGHT_DRIVE_CIM = 1,
    				  ELEVATOR_CIM = 2;
    public static int DRIVE_STICK = 1,
    				  COMMAND_STICK = 2;
    
    /* Sensors */
    public static final int MAIN_GYRO = 1;
    public static final double GYRO_SENSITIVITY = 0.007;
    
    
 // Axis indexes:
    public static final int
            LEFT_X_AXIS = 1,
            LEFT_Y_AXIS = 2,
            TRIGGERS = 3,
            RIGHT_X_AXIS = 4,
            RIGHT_Y_AXIS = 5,
            DPAD_LR = 6;
    
    // Button mappings:
    public static final int
            BUTTON_A = 1,
            BUTTON_B = 2,
            BUTTON_X = 3,
            BUTTON_Y = 4,
            BUMPER_L = 5,
            BUMPER_R = 6,
            BUTTON_BACK = 7,
            BUTTON_START = 8,
            LEFT_STICK_PRESS = 9,
            RIGHT_STICK_PRESS = 10;
    
    
    
}
