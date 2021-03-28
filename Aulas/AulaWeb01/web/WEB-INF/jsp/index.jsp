<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.SimpleDate"%>
<%@page import="java.util.Date"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalho com JSP</title>
    </head>

    <body>
        
        <h1>Java no Navegador</h1>
        <%
            out.println("<h2>Começando com Java Sever Pages</h2>");
        %>
        <p>A data de hoje é: <%= new Date()%> </p>
        
            int dia = Integer.parseInt((new SimpleDateFormat("dd"))
                .format(new Date()));
            out.println("<br>Hoje é dia: " + dia);
        
    </body>
</html>
