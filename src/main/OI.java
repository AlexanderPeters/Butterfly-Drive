package main;

import lib.joystick.XboxController;
import main.commands.drivetrain.DriveMechanum;
import main.commands.pnuematics.PopDown;
import main.commands.pnuematics.PopUp;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI implements Constants, HardwareAdapter {
	
	public OI() {
		check();
	}
	
	public static XboxController getXbox (){
		return xbox;
	}

	public void check(){
		xbox.leftBumper.whenPressed(new PopUp());
		xbox.leftBumper.whenReleased(new PopDown());	
		xbox.leftBumper.whileHeld(new DriveMechanum());
	}
}

