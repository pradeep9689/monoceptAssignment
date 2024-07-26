package com.monocept.command.test;

import com.monocept.command.model.ICommand;
import com.monocept.command.model.OffCommand;
import com.monocept.command.model.OnCommand;
import com.monocept.command.model.RemoteControl;
import com.monocept.command.model.Television;

public class televisionTest {

	public static void main(String[] args) {

		Television tv = new Television();

		ICommand onCommand = new OnCommand(tv);
		ICommand offCommand = new OffCommand(tv);

		RemoteControl remote = new RemoteControl();

		remote.setCommand(onCommand);
		remote.pressButton();

		remote.setCommand(offCommand);
		remote.pressButton();
	}

}
