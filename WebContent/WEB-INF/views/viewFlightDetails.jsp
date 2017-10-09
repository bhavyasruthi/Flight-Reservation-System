<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Flight Details :
<form action="updatingflightdetails">
<table BORDER="1"><tr><th>NAME</th><th>SOURCE</th><th>DESTINATION</th><th>SEATS AVAILABLE</th></tr>
<tr><td>${f.name}</td>
<td><input type="text" value="${f.source}" name="source"></td>
<td><input type="text" value="${f.destination}" name="destination"></td>
<td><input type="text" value="${f.seats}" name="seats"></td></tr>
</table>

<input type="submit" name="submit">
</form>
</body>
</html>