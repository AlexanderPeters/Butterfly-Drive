package main;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DigitalOutput;
import lib.joystick.AdvJoystick;
import lib.joystick.XboxController;

public interface HardwareAdapter extends Constants {
	//OI
	public static XboxController xbox = new XboxController(Xbox_Port);
	
	//DriveTrain
	public static Jaguar rearLeftDrive = new Jaguar(LEFT_Drive_Rear);
	public static Jaguar frontLeftDrive = new Jaguar(LEFT_Drive_Front);
	public static Jaguar rearRightDrive = new Jaguar(RIGHT_Drive_Rear);
	public static Jaguar frontRightDrive = new Jaguar(RIGHT_Drive_Front);
	
	//Pnuematics
	public static DoubleSolenoid  popperFront = new DoubleSolenoid(PCM_Port, POPPER_FRONT_EXT, POPPER_FRONT_RET);
	public static DoubleSolenoid  popperRear = new DoubleSolenoid(PCM_Port, POPPER_REAR_EXT, POPPER_REAR_RET);
	public static Compressor comp = new Compressor(PCM_Port);
	

	
	
	

}
