package main.subsytems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;

public class Pneumatics extends Subsystem implements Constants, HardwareAdapter  {

	public Pneumatics() {
		comp.setClosedLoopControl(true);
	}
	
	public void pop(DoubleSolenoid.Value v) {
		System.out.println("Triggered " + v);
		popperFront.set(v);
		popperRear.set(v);
	}
	
	public void toggleComp() {
		if (comp.enabled())
			comp.stop();
		else
			comp.start();
	}
	
	public void turnCompOff() {
		if (comp.enabled())
			comp.stop();
	}

	public void initDefaultCommand() {
		setDefaultCommand(null);
	}
}