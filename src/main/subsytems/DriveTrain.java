package main.subsytems;

import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.commands.drivetrain.DriveTank;
import Util.DriveHelper;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain extends Subsystem implements Constants, HardwareAdapter {
	//Four independently driven wheels re-imagined as 2 tank drives tied together
	private static RobotDrive tankDriveTrainFront = new RobotDrive(frontLeftDrive, frontRightDrive);
	private static RobotDrive tankDriveTrainRear = new RobotDrive(rearLeftDrive, rearRightDrive);
	//Four independently driven wheels re-imagined as a mechanum drive
	private static RobotDrive mechanumDriveTrain = new RobotDrive(rearLeftDrive, frontLeftDrive, rearRightDrive, frontRightDrive);
	//Helper to prevent things from going crazy if the joystick reports values greater than 1 or less than -1
	private DriveHelper helper = new DriveHelper(7.5);

	public DriveTrain() {
		frontLeftDrive.setInverted(true);
		rearRightDrive.setInverted(true);		
	}

	public void driveTank(double throttle, double heading) {
		tankDriveTrainFront.arcadeDrive(helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)), helper.handleOverPower(helper.handleDeadband(heading, headingDeadband)));	   
		tankDriveTrainRear.arcadeDrive(helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)), helper.handleOverPower(helper.handleDeadband(heading, headingDeadband)));	 
	}
	
	public void driveMechanum(double throttle, double heading, double straffe) {
		mechanumDriveTrain.mecanumDrive_Cartesian(helper.handleOverPower(helper.handleDeadband(straffe, throttleDeadband)), helper.handleOverPower(helper.handleDeadband(heading, throttleDeadband)), helper.handleOverPower(helper.handleDeadband(throttle, headingDeadband)), 0.0);
	}
		
    public void initDefaultCommand() {
       setDefaultCommand(new DriveTank());
    }
}
