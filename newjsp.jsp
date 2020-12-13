<%-- 
    Document   : newjsp
    Created on : 13/12/2020, 17:52:00
    Author     : Sanizaca Bryan, Mirabá Washington Jiménez Anthony
--%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Hora actual</title>
    </head>
    <body>
        <h1><%
            DateFormat formato = new SimpleDateFormat("hh:mm:ss");
            String hora = formato.format(new Date());
        %>
        La hora actual es: <%=hora%>
        </h1>
    </body>
</html>
