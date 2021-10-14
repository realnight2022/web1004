<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <H1>Using the Application Object</H1>
        <%
        Integer counter = (Integer)session.getAttribute("cnt");
        String heading = null;
        if (counter == null) {
            counter = new Integer(1);
        } else {
            counter = new Integer(counter.intValue() + 1);
        }

        session.setAttribute("cnt", counter);

        Integer i = (Integer)application.getAttribute("cnt2");
        if (i == null) {
            i = new Integer(1);
        } else {
            i = new Integer(i.intValue() + 1);
        }

        application.setAttribute("cnt2", i);
        %>

        You have visited this page <%=counter%> times.
        <BR>
        This page has been visited by all users <%=i%> times.

</body>
</html>