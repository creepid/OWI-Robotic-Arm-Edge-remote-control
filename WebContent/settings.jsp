<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    Current settings set:
    <bean:write name="SettingsForm" property="number" />
     <bean:write name="SettingsForm" property="baudRate" />
    
        <html:form action="/SettingsAction" >
            <table>
                <tr>
                    <td>
                        Select COM port number :
                    </td>
                    <td>
                        <html:select property="number" >
                            <html:optionsCollection name="SettingsForm" property="numberList" label="label" value="value" />
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td>
                        Select Baud Rate :
                    </td>
                    <td>
                        <html:select property="baudRate" >
                            <html:optionsCollection name="SettingsForm" property="rateList" label="label" value="value" />
                        </html:select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <html:submit property="method" value="save" />
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
