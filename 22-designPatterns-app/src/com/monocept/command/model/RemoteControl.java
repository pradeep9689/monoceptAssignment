package com.monocept.command.model;

public class RemoteControl {
	private ICommand command;

	public void setCommand(ICommand command) {
		this.command = command;
	}
	

	public ICommand getCommand() {
		return command;
	}


	public void pressButton() {
		command.execute();
	}
}
