package main.commands.pnuematics;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import main.Constants;

public class PopUp extends CommandGroup implements Constants{
	 public PopUp() {
	    	addSequential(new Pop(EXT));
	    	addSequential(new WaitCommand(0.1));
	    	addSequential(new Pop(OFF));
	 }
}