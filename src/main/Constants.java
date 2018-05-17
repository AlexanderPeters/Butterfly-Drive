package main;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


//This is an interface that allows all constants stored here to be visible to other classes
public interface Constants {
	/*************
	 * VARIABLES *
	 *************/
	// ROBOT VARIABLES
	
	public final double gmIntakeMotorForward = -1.0;
	public final double gmIntakeMotorReverse = 1.0;
	public final double gmIntakeMotorOff = 0.0;
	public final double climberMotorForwardFast = 1;
	public final double climberMotorForwardSlow = 0.8;
	
	public final double driveThrottle = 1.0;
	public final double turnThrottle = 1.0;

	
	// JOYSTICK DEADBAND'S
	public final double throttleDeadband = 0.02;
	public final double headingDeadband = 0.02;
	public final double strafeDeadband = 0.02;
	
	/*************
	 * CONSTANTS *
	 *************/
	
	// DEFAULT TALON MODES
	public final ControlMode DEFAULT_CTRL_MODE = ControlMode.PercentOutput;
	public final boolean DEFAULT_BRAKE_MODE = true;
	// TALON CONTROL MODES
	public final ControlMode VELOCITY = ControlMode.Velocity;
	public final ControlMode PERCENT_VBUS_MODE = ControlMode.PercentOutput;
	public final ControlMode POSITION = ControlMode.Position;
	public final ControlMode VOLTAGE_MODE = ControlMode.Current;
	public final ControlMode SLAVE_MODE = ControlMode.Follower;
	public final ControlMode DISABLED = ControlMode.Disabled;
	// TALON BRAKE MODES
	public final boolean BRAKE_MODE = true;
	public final boolean COAST_MODE = false;
	// PNEUMATIC STATES
	public final DoubleSolenoid.Value EXT = Value.kForward;
	public final DoubleSolenoid.Value RET = Value.kReverse;
	public final DoubleSolenoid.Value OFF = Value.kOff;
		
	/****************
	 * DEVICE PORTS *
	 ****************/
	// JOYSTICKS (USB)
	public final int Xbox_Port = 0;
	
	// TALON SRX'S (CAN BUS)
	public final int LEFT_Drive_Front = 2;
	public final int LEFT_Drive_Rear = 3;
	//public final int LEFT_Drive_Slave2 = 4;
	public final int RIGHT_Drive_Front = 5;
	public final int RIGHT_Drive_Rear = 6;
	//public final int RIGHT_Drive_Slave2 = 7;
	
	// OTHER MOTOR CONTROLLERS (PWM)
	public final int Gear_Intake_Motor = 9;
	public final int Climber_Motor = 3;
	// PNEUMATICS (PCM)
	public final int PCM_Port = 1;

	public final int GEAR_EXT = 2;//Currently in by default
	public final int GEAR_RET = 5;
	public final int SHIFTER_EXT = 6;//(isCompRobot? 6:3);
	public final int SHIFTER_RET = 3;//(isCompRobot? 3:6);
	
	public final int POPPER_FRONT_EXT = 0;
	public final int POPPER_FRONT_RET = 0;
	public final int POPPER_REAR_EXT = 0;
	public final int POPPER_REAR_RET = 0;
	
		
}
