<%@page import="com.vivah.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Matrimony</title>
</head>
<body>
<table>
<tr><td>UserId</td><td>Name</td><td>Date of Birth</td><td>Education<td></td>Job Description</td><td>Location</td><td>Religion</td></tr>
<%
List<User> users =(List<User>) request.getAttribute("userList");
for(User u:users){%>
	<tr><td><a href="otherProfile.do?view='<%=u.getUserId() %>' "><%=u.getUserId() %></a></td><td><%=u.getfName()+" "+u.getlName() %></td><td><%=u.getDob() %></td><td><%= u.getEducation() %></td><td><%=u.getJob() %></td><td><%=u.getState()+" "+u.getCity() %></td><td><%=u.getReligion() %></td></tr>
<%}%>

</table>
</body>
</html>