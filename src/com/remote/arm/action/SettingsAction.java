package com.remote.arm.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.util.LabelValueBean;

import com.remote.arm.form.SettingsForm;
import com.remote.arm.serial.SerialComm;

public class SettingsAction extends DispatchAction {
	
	 private final static String SUCCESS = "success";
	 
	 public ActionForward populate(ActionMapping mapping, ActionForm  form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {

	        ArrayList numberList = new ArrayList();
	        ArrayList rateList = new ArrayList();
	        SettingsForm settingsForm = (SettingsForm) form;

	        numberList.add(new LabelValueBean("COM4", "1"));
	        numberList.add(new LabelValueBean("COM5", "2"));
	        numberList.add(new LabelValueBean("COM6", "3"));
	        numberList.add(new LabelValueBean("COM7", "4"));

	        rateList.add(new LabelValueBean("2400", "1"));
	        rateList.add(new LabelValueBean("4800", "2"));
	        rateList.add(new LabelValueBean("9600", "3"));
	        rateList.add(new LabelValueBean("19200", "4"));

	        settingsForm.setNumberList(numberList);
	        settingsForm.setRateList(rateList);
	        
	        return mapping.findForward(SUCCESS);
	    }

	    
	    
	    public ActionForward save(ActionMapping mapping, ActionForm  form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {    	
	    	SettingsForm settingsForm = (SettingsForm) form;
	    	
	    	int numberCom=Integer.valueOf(settingsForm.getNumber());
	    	int numberRate=Integer.valueOf(settingsForm.getBaudRate());
	    	
	    	LabelValueBean comLabelValueBean=(LabelValueBean)settingsForm.getNumberList().get(numberCom-1);
	    	LabelValueBean rateLabelValueBean=(LabelValueBean)settingsForm.getRateList().get(numberRate-1);
	    	
	    	SerialComm.setCOM_PORT_NUM(comLabelValueBean.getLabel());
	    	SerialComm.setCOM_BOUD_RATE(Integer.valueOf(rateLabelValueBean.getLabel()));
	    	
	    	settingsForm.setNumber(comLabelValueBean.getLabel());
	        settingsForm.setBaudRate(rateLabelValueBean.getLabel());
	  
	        return mapping.findForward(SUCCESS);
	    }

}
