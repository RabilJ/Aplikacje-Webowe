<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Jakub
  Date: 2018-11-06
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Pętelka</h1>
<h2>
<%

    String num = request.getParameter("number");
int n = Integer.parseInt(num);
int sum = 0;
    for (int i = n; i >0 ; i--) {
        if (i > 1) {
            out.print(i + " + ");
            sum += i;
        } else {
            out.print(i + " = ");
            sum += i;
        }
    }
    out.print(sum);
    %>
</h2>
</body>
</html>
