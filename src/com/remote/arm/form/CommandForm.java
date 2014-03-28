package com.remote.arm.form;

import org.apache.struts.action.ActionForm;

public class CommandForm extends ActionForm {
	
	private String command;
	private String message;
	private String sensit;
	
	public CommandForm() {
        super();
        this.sensit="low";
        // TODO Auto-generated constructor stub
    }

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSensit() {
		return sensit;
	}

	public void setSensit(String sensit) {
		this.sensit = sensit;
	}
	
	
}
