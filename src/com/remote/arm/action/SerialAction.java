package com.remote.arm.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

import com.remote.arm.form.CommandForm;
import com.remote.arm.serial.SerialComm;


public class SerialAction extends LookupDispatchAction {
	
	private final static String COMMAND_PAGE = "commandPage";
	private SerialComm serialComm=null;
	private static volatile String sensit;

	@Override
	protected Map getKeyMethodMap() {
		  Map map = new HashMap();
	      map.put("motor1.up", "commandMotor1Up");
	      map.put("motor1.down", "commandMotor1Down");
	      
	      map.put("motor2.up", "commandMotor2Up");
	      map.put("motor2.down", "commandMotor2Down");
	      
	      map.put("motor3.up", "commandMotor3Up");
	      map.put("motor3.down", "commandMotor3Down");
	      
	      map.put("motor4.up", "commandMotor4Up");
	      map.put("motor4.down", "commandMotor4Down");
	      
	      map.put("motor5.up", "commandMotor5Up");
	      map.put("motor5.down", "commandMotor5Down");
	      
	      map.put("light.on", "commandLightOn");
	      map.put("light.off", "commandLightOff");
	      
	      return map;
	}

	
	public ActionForward commandMotor1Up(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor1_up", sensit);
        commandForm.setMessage("motor1 move up with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	public ActionForward commandMotor1Down(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor1_down", sensit);
        commandForm.setMessage("motor1 move down with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	
	public ActionForward commandMotor2Up(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor2_up", sensit);
        commandForm.setMessage("motor2 move up with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	public ActionForward commandMotor2Down(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor2_down", sensit);
        commandForm.setMessage("motor2 move down with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	
	public ActionForward commandMotor3Up(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor3_up", sensit);
        commandForm.setMessage("motor3 move up with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	public ActionForward commandMotor3Down(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor3_down", sensit);
        commandForm.setMessage("motor3 move down with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	
	public ActionForward commandMotor4Up(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor4_up", sensit);
        commandForm.setMessage("motor4 move up with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	public ActionForward commandMotor4Down(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor4_down", sensit);
        commandForm.setMessage("motor4 move down with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	
	public ActionForward commandMotor5Up(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor5_up", sensit);
        commandForm.setMessage("motor5 move up with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
	public ActionForward commandMotor5Down(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CommandForm commandForm = (CommandForm) form;
        sensit=commandForm.getSensit();
        
        serialComm=new SerialComm("motor5_down", sensit);
        commandForm.setMessage("motor5 move down with "+sensit);
        
        return mapping.findForward(COMMAND_PAGE);
    }
	
}
