<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
    <head>
        <title>
            Highlight Error Fields
        </title>
        <link href="style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
    <font size="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	Robot ARM EDGE control</font>
        <html:form action="login" >
        <html:errors property="loginValidation" />
        <table>
            <tr>
                <td>
                    User Name
                </td>
                <td>
                    <html:text property="userName" errorStyleClass="error" errorKey="org.apache.struts.action.ERROR" />
                </td>
                <td>
                    <html:errors property="userName" />
                </td>
            </tr>
            <tr>
                <td>
                    Password
                </td>
                <td>
                    <html:password property="password" errorStyleClass="error" errorKey="org.apache.struts.action.ERROR" />
                </td>
                <td>
                    <html:errors property="password" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <html:submit value="Login" />
                </td>
                <td></td>
            </tr>
        </table>
        </html:form>
                 <p align="left">&nbsp;&nbsp;&nbsp;&nbsp;Or see robot camera view
		<a href="camera.jsp">here</a> (for unregister users)</p>
    </body>
</html>