package com.remote.arm.form;

import java.util.ArrayList;

import org.apache.struts.util.LabelValueBean;

public class SettingsForm extends org.apache.struts.action.ActionForm {
	
    private String number;
    
    private String baudRate;

    private ArrayList numberList;

    private ArrayList rateList;
    
    public SettingsForm() {
        super();
        number="1";
        baudRate="1";
    }

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBaudRate() {
		return baudRate;
	}

	public void setBaudRate(String baudRate) {
		this.baudRate = baudRate;
	}

	public ArrayList getNumberList() {
		return numberList;
	}

	public void setNumberList(ArrayList numberList) {
		this.numberList = numberList;
	}

	public ArrayList getRateList() {
		return rateList;
	}

	public void setRateList(ArrayList rateList) {
		this.rateList = rateList;
	}

}
