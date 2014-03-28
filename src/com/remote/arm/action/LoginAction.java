package com.remote.arm.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.remote.arm.form.LoginForm;



public class LoginAction extends Action {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	LoginForm loginForm = (LoginForm) form;
    	HttpSession session = request.getSession(true);
    	session.setAttribute("logined", "true");
    	session.setAttribute("user", loginForm.getUserName());
    	
        return mapping.findForward(SUCCESS);
    }
}
