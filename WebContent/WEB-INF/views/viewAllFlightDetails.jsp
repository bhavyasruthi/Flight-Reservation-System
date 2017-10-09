<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.frs.*, java.util.*, java.io.*" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<center><H1>
FLIGHT DETAILS</H1>
<table border='1'>
<body>
<tr><th>NAME</th><th>SOURCE</th><th>DESTINATION</th><th>SEATS AVAILABLE</th></tr>
<c:forEach items="${flightList}" var="f">
<tr><td><c:out value="${f.name}"></c:out></td>
<td><c:out value="${f.source}"></c:out></td>
<td><c:out value="${f.destination}"></c:out></td>
<td><c:out value="${f.seats}"></c:out></td></tr>
</c:forEach>
</tbody>
</table>
</center>
</body>
</html>