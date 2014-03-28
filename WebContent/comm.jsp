<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Send Command</h1>

<html:form action="CommandAction" >
            <table>
                <tr>
                    <td>
                        <bean:write name="CommandForm" property="message" />
                    </td>
                </tr>
                
                <tr>
                <td>
                    Sensitivity :
                </td>
                <td>
                    <html:radio name="CommandForm" property="sensit" value="low">
                        Low
                    </html:radio>
                    <html:radio name="CommandForm" property="sensit" value="medium">
                        Medium
                    </html:radio>
                    <html:radio name="CommandForm" property="sensit" value="high">
                        High
                    </html:radio>
                </td>
            </tr>
            </table>
                
             <table>
               <center>
                <tr>
                    <td>
                    
                        <html:submit property="move"><bean:message key="motor1.up"/></html:submit>
                    </td>
                    <td>
                    
                        <html:submit property="move"><bean:message key="motor2.up"/></html:submit>
                    </td>
                    <td>
                    
                        <html:submit property="move"><bean:message key="motor3.up"/></html:submit>
                    </td>
                     <td>
                    
                        <html:submit property="move"><bean:message key="motor4.up"/></html:submit>
                    </td>
                     <td>
                    
                        <html:submit property="move"><bean:message key="motor5.up"/></html:submit>
                    </td>
                </tr>
                <tr>
                    <td>
          
                        <html:submit property="move"><bean:message key="motor1.down"/></html:submit>
                    </td>
                    <td>
          
                        <html:submit property="move"><bean:message key="motor2.down"/></html:submit>
                    </td>
                    <td>
          
                        <html:submit property="move"><bean:message key="motor3.down"/></html:submit>
                    </td>
                    <td>
          
                        <html:submit property="move"><bean:message key="motor4.down"/></html:submit>
                    </td>
                    <td>
          
                        <html:submit property="move"><bean:message key="motor5.down"/></html:submit>
                    </td>
                </tr>
            </table>
           </center>
        </html:form>


</body>
</html>