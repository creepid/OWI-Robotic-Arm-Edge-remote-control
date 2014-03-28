package com.remote.arm.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogoutAction extends org.apache.struts.action.Action {
	
	private final static String LOGIN_PAGE = "loginPage";
	
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	HttpSession session = request.getSession(true);
    	session.invalidate();
        return mapping.findForward(LOGIN_PAGE);
    }


}
